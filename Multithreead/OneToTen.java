package com.Multithreead;

    class PrintNumbers extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500); // Pause for 500 ms
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        }
    }
    public class OneToTen {
        public static void main(String[] args) {
            PrintNumbers printNumbersThread = new PrintNumbers();
            printNumbersThread.start();
            try {
                printNumbersThread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }

            System.out.println("Thread execution completed.");
        }
    }


