package com.LinkesList;
import java.util.HashMap;

public class HashMapp {

        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();

            map.put("Apple", 50);
            map.put("Banana", 30);
            map.put("Cherry", 75);

            System.out.println("Original HashMap: " + map);
            map.put("Date", 100);

            System.out.println("Updated HashMap: " + map);
        }
    }


