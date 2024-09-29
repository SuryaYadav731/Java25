package com.LinkesList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreLis {
        public static void main(String[] args) {

            Map<String, Integer> cricketerScores = new HashMap<>();

            cricketerScores.put("Sachin Tendulkar", 18426);
            cricketerScores.put("Virat Kohli", 7547);
            cricketerScores.put("Rohit Sharma", 9200);
            cricketerScores.put("Brian Lara", 11953);
            cricketerScores.put("Jacques Kallis", 13289);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the cricketer to search for their score: ");
            String nameToSearch = scanner.nextLine();

            if (cricketerScores.containsKey(nameToSearch)) {
                int score = cricketerScores.get(nameToSearch);
                System.out.println(nameToSearch + "'s score is: " + score);
            } else {
                System.out.println("Cricketer not found in the records.");
            }

        }
    }


