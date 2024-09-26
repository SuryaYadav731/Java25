package com.DayThree;
import java.util.Arrays;
public class HighestNumber {
        public static void main(String[] args) {
            int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
            int[] subArray = Arrays.copyOfRange(array, 2, 7);

            System.out.print("Sub array: ");
            for (int num : subArray) {
                System.out.print(num + " ");
            }
            System.out.println();
            Arrays.sort(subArray);
            int secondHighest = subArray[subArray.length - 2];
            System.out.println("2nd Highest element: " + secondHighest);
        }
    }


