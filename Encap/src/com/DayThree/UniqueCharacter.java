package com.DayThree;
import java.util.HashMap;
import java.util.Scanner;


public class UniqueCharacter {
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            printUniqueCharacters(input);
            scanner.close();
        }
        public static void printUniqueCharacters(String str) {
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
            System.out.print("Unique characters: ");
            for (char c : charCountMap.keySet()) {
                if (charCountMap.get(c) == 1) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

