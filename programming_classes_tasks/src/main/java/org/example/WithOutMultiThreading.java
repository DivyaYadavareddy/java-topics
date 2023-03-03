package org.example;

import java.util.Date;

public class WithOutMultiThreading {
    public static void main(String args[]){
        // both loops run on a single thread
        // 1. create array with 1 to 100000
        int array[] = new int[100001]; // initializing an array
        //System.out.println("Array of elements");
        for(int index=1;index<=100000;index++){
            array[index] = index;
            //System.out.println(array[index]);
        }
//        // 2. Create one for loop for printing (even numbers * 2) in given array
        // get the start time
        //Date startTime = new Date();
        long startTime1 = System.nanoTime();
        System.out.println("Odd numbers * 3 in given array");
        for(int index = 1;index<=100000;index++){
           if(array[index]%2!=0){
               System.out.println(array[index]*3);
           }
        }
        // 3. Create 2 nd for loop for printing (odd numbers * 3) in given array
        System.out.println("even numbers * 2 in given array");
        for(int index = 1;index<=100000;index++){
            if(array[index]%2==0){
                System.out.println(array[index]*2);
            }
        }
//        // get the end time
//        Date endTime = new Date();
//        // 4. Calculate time complexity for running the whole program
//        long diff = endTime.getTime() - startTime.getTime();
//        System.out.print("Duration : " + diff + " diff ");
//        long diffSeconds = diff / (1000 % 60);
//        System.out.print("Duration : " + diffSeconds + " seconds ");
        // without multi threading : 20 seconds or 12 seconds

        long endTime1   = System.nanoTime();
        long totalTime = endTime1 - startTime1;
        System.out.println(" \nduration :"+totalTime+" nanoseconds\n"); //0.547728864 seconds
    }
}
