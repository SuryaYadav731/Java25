package com.LinkesList;
import java.util.HashMap;
public class HashKey {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            if (map.isEmpty()) {
                System.out.println("The HashMap is empty.");
            } else {
                System.out.println("The HashMap is not empty.");
            }
            map.put("Apple", 50);
            map.put("Banana", 30);
            if (map.isEmpty()) {
                System.out.println("The HashMap is empty.");
            } else {
                System.out.println("The HashMap is not empty.");
            }
        }
    }


