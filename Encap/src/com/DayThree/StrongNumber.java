package com.DayThree;
import java.util.Scanner;


public class StrongNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (isStrongNumber(number)) {
                System.out.println(number + " is a Strong number.");
            } else {
                System.out.println(number + " is not a Strong number.");
            }
            scanner.close();
        }

        public static boolean isStrongNumber(int num) {
            int originalNumber = num;
            int sumOfFactorials = 0;
            while (num > 0) {
                int digit = num % 10;
                sumOfFactorials += factorial(digit);
                num /= 10;
            }
            return sumOfFactorials == originalNumber;
        }

        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }

            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }


