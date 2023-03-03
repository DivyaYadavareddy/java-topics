package org.example;
//package org.example;
//
//// Java program that prints the odd*3 and even*2 numbers using two threads.
//public class OddEvenMultiThreadingExample
//{
//    // 100000 array initialization
//    int array[] = new int[100001];
//    // Method for printing the odd numbers *3
//    public void displayOddNumber()
//    {
//        synchronized (this)
//        {
//           // Printing the numbers till 100000
//           for(int index=1;index<100000;index++) {
//               // If the index is even then display
//               if (index % 2 == 0)
//               {
//// handling the exception handle
//                   try
//                   {
//                       wait();
//                   }
//                   catch (InterruptedException ex)
//                   {
//                       ex.printStackTrace();
//                   }
//               }
//               // Printing the number
//               System.out.print(index + " ");
//               // notifying the thread which is waiting for this lock
//               notify();
//           }
//        }
//    }
//    // Method for printing the even numbers
//    public void displayEvenNumber() {
//        synchronized (this) {
//// Printing the number till NUM
//            for (int index = 1; index < 10; index++) {
//                    // If the count is odd then display
//                    if (index % 2 == 1) {
//                        // handling the exception
//                        try {
//                            wait();
//                        } catch (InterruptedException ex) {
//                            ex.printStackTrace();
//                        }
//                    }
//                    // Printing the number
//                    System.out.print(index + " ");
//                    // Notifying to the 2nd thread
//                    notify();
//                }
//            }
//        }
//        // main method
//        public static void main(String[] args) {
//        // creating an object of the class OddEvenExample
//        OddEvenMultiThreadingExample oe = new OddEvenMultiThreadingExample();
//        // creating a thread th1
//        Thread th1 = new Thread(new Runnable()
//        {
//            public void run()
//            {
//                // invoking the method displayEvenNumber() using the thread th1
//                oe.displayEvenNumber();
//            }
//        });
//        // creating a thread th2
//        Thread th2 = new Thread(new Runnable()
//        {
//            public void run()
//            {
//                // invoking the method displayOddNumber() using the thread th2
//                oe.displayOddNumber();
//            }
//        });
//        // starting both of the threads
//        th1.start();
//        th2.start();
//    }
//}

import java.util.Date;

// Java program that prints the odd and even numbers using two threads.
// the time complexity of the program is O(N), where N is the number up to which we
// are displaying the numbers
public class OddEvenMultiThreadingExample
{
    // Starting the counter
    int index = 1;
    static int size;
    // Method for printing the odd numbers
    public void displayOddNumber()
    {
    // note that synchronized blocks are necessary for the code for getting the desired
    // output. If we remove the synchronized blocks, we will get an exception.
        synchronized (this)
        {
            // Printing the numbers till NUM
            while (index < size)
            {
                // If the contr is even then display
                if (index % 2 == 0)
                {
                    // handling the exception handle
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }
                // Printing the number
                System.out.print(index*3 + " ");
                // Incrementing the contr
                index = index + 1;
                // notifying the thread which is waiting for this lock
                notify();
            }
        }
    }
    // Method for printing the even numbers
    public void displayEvenNumber()
    {
        synchronized (this)
        {
            // Printing the number till NUM
            while (index < size)
            {
                // If the count is odd then display
                if (index % 2 == 1)
                {
                    // handling the exception
                    try
                    {
                        wait();
                    }
                    catch (InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                }
                // Printing the number
                System.out.print(index*2 + " ");
                // Incrementing the contr
                index = index +1;
                // Notifying to the 2nd thread
                notify();
            }
        }
    }
    // main method
    public static void main(String[] argvs)
    {
        // The NUM is given
        size = 100000;
        // creating an object of the class OddEvenExample
        OddEvenMultiThreadingExample oe = new OddEvenMultiThreadingExample();
        // creating a thread th1
        Thread th1 = new Thread(new Runnable()
        {
            public void run()
            {
                // invoking the method displayEvenNumber() using the thread th1
                oe.displayEvenNumber();
            }
        });
        // creating a thread th2
        Thread th2 = new Thread(new Runnable()
        {
            public void run()
            {
                // invoking the method displayOddNumber() using the thread th2
                oe.displayOddNumber();
            }
        });
        // get the start time
        //Date startTime = new Date();
        long startTime = System.nanoTime();
        // starting both of the threads
        th1.start();
        th2.start();
        //Date endTime = new Date();
//        long startTime1 = System.nanoTime();
//        // Calculate time complexity for running the whole program
//        long diff = endTime.getTime() - startTime.getTime();
//        //long diffSeconds = diff / (1000 % 60);
//        System.out.print(" \nduration :"+diff+"seconds\n"); // 1.56 seconds   or 0.96 seconds
//        //System.out.print("Duration : " + (diff/16.6) + " seconds\n");

        // get the end time
        // get the end time
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(" \nduration :"+totalTime+"nanoseconds\n"); // 6142893 nano seconds //0.006142893 seconds
    }
}