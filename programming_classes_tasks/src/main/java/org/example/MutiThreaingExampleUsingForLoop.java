package org.example;

import java.util.Date;

public class MutiThreaingExampleUsingForLoop {
    // static variable declaration
    static int size ;
    public void printOddNumber ( )
    {
        synchronized ( this )
        {
            for(int counter=1;counter<=size;counter++) {
                if ( counter % 2 == 0 ) {
                    try {
                        wait ( ) ;
                    }
                    catch (
                            InterruptedException e )  {
                        e . printStackTrace ( ) ;
                    }
                }
                System . out . print ( counter*3 + " " ) ;
                //counter ++ ;
                notify ( ) ;
            }
        }
    }
    public void printEvenNumber (  )
    {
        synchronized ( this )
        {
            for(int counter=1;counter<=size;counter++) {
                if ( counter % 2 == 1 ) {
                    // using exception handling keywords
                    try {
                        wait ( ) ;
                    }
                    catch (
                            InterruptedException e ) {
                        e . printStackTrace ( ) ;
                    }
                }
                System . out . print ( counter*2 + " " ) ;
                //counter  ++ ;
                notify ( ) ;
            }
        }
    }
    public static void main ( String [ ] args )
    {
        size = 100000 ;
        MutiThreaingExampleUsingForLoop mt = new MutiThreaingExampleUsingForLoop ( ) ;
        Thread t1 = new Thread ( new Runnable ( ) {
            public void run ( )
            {
                mt . printEvenNumber ( ) ;
            }
        } ) ;
        Thread t2 = new Thread ( new Runnable ( ) {
            public void run()
            {
                mt . printOddNumber ( ) ;
            }
        } ) ;
        // get the start time
        Date startTime = new Date();
        long startTime1 = System.nanoTime();
        t1 . start ( ) ;
        t2 . start ( ) ;
        // get the end time
        long endTime1   = System.nanoTime();
        long totalTime = endTime1 - startTime1;
        System.out.println(" \nduration :"+totalTime+"nanoseconds\n"); // 0.015768244 seconds or 13989167 nanoseconds
//        Date endTime = new Date();
//        System.out.println("endtime:"+endTime);
//        // Calculate time complexity for running the whole program
//        long diff = endTime.getTime() - startTime.getTime();
//        //long diffSeconds = diff / (1000 % 60);
//        System.out.print(" \nduration :"+diff+"\n"); // 1.56 seconds
//        //System.out.print("Duration : " + (diff/16.6) + " seconds\n");
    }
}