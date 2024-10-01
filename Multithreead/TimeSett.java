package com.Multithreead;


    class MyThreads extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

public class TimeSett {
        public static void main(String[] args) {
            MyThreads t1 = new MyThreads();
            MyThreads t2 = new MyThreads();
            MyThreads t3 = new MyThreads();

            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            t2.start();
            t3.start();
        }
    }

