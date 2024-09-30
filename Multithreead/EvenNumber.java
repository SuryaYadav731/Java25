package com.Multithreead;


    class EvenNumberPrinter extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i <= 20; i += 2) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

public class EvenNumber {
        public static void main(String[] args) {
            EvenNumberPrinter evenThread = new EvenNumberPrinter();
            evenThread.start(); 

            try {
                evenThread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }

            System.out.println("Even numbers printed.");
        }
    }


