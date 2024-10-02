package com.TreeMapp;
import java.util.TreeMap;

public class Treee {
        public static void main(String[] args) {
            TreeMap<String, Integer> treeMap = new TreeMap<>();

            treeMap.put("One", 1);
            treeMap.put("Three", 3);
            treeMap.put("Two", 2);

            System.out.println("Original TreeMap: " + treeMap);
            Integer removedValue = treeMap.remove("Two");
            System.out.println("Removed value = " + removedValue);

            boolean isRemoved = treeMap.remove("Three", 3);
            System.out.println("Is the entry {Three=3} removed? " + isRemoved);

            System.out.println("Updated TreeMap: " + treeMap);
        }
    }


