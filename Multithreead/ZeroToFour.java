package com.Multithreead;

    class PrintNumberss extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {

                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }

    public class ZeroToFour {
        public static void main(String[] args) {
            PrintNumberss printNumbersThread = new PrintNumberss();
            printNumbersThread.start();

            try {
                printNumbersThread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }

            System.out.println("Thread execution completed.");
        }
    }


