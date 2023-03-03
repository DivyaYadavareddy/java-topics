package org.example;

class Simple1 extends Thread{
    public void run(){
        for(int index=1;index<=10;index++) {
            // If the index is even then display
            if (index % 2 == 0)
                // Printing the number
                System.out.print(index);
        }
    }
}

class Simple2 extends Thread{
    public void run(){
        for(int index=1;index<=10;index++) {
            // If the index is even then display
            if (index % 2!= 0)
                // Printing the number
                System.out.print(index);
        }
    }
}

class WithMultiThreading{
    public static void main(String args[]){
        Simple1 t1=new Simple1();
        Simple2 t2=new Simple2();

        t2.start();
        t1.start();
    }
}