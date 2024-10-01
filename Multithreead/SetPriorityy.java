package com.Multithreead;


    class MyThread extends Thread {
        public void run() {
            System.out.println(getName() +" is running.");
        }
    }

        public class SetPriorityy {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();
            MyThread t3 = new MyThread();
            t1.setName("Thread-1");
            t2.setName("Thread-2");
            t3.setName("Thread-3");

            t1.setPriority(Thread.MAX_PRIORITY);
            t2.setPriority(Thread.NORM_PRIORITY);
            t3.setPriority(Thread.MIN_PRIORITY);


            t1.start();
            t2.start();
            t3.start();
        }
    }


