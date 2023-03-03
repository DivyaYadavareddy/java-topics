package org.example;
public class Threading_concept {
    public static void main(String[] args) {

        Concurrency thread1 = new Concurrency(1);
        Concurrency thread2 = new Concurrency(2);

        thread1.start();
        thread2.start();
    }
}

class Concurrency extends Thread {

    private int loopNum;

    Concurrency(int loopNum) {
        this.loopNum = loopNum;
    }

    @Override
    public void run() {

        for (byte i = 1; i <= 5; i++) {

            // sleep .5 seconds for demonstration purposes
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Loop " + this.loopNum + ", Iteration: " + i);
        }
    }
}