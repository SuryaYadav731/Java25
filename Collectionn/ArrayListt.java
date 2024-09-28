package com.Collectionn;
import java.util.ArrayList;
public class ArrayListt {


        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();

            numbers.add(10);
            numbers.add(15);
            numbers.add(20);
            numbers.add(25);
            numbers.add(30);

            System.out.println("Original List: " + numbers);

            int sumOfEven = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    sumOfEven += number;
                }
            }
            System.out.println("Sum of Even Numbers: " + sumOfEven);
        }
    }


