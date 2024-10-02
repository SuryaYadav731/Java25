package com.TreeMapp;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AllMethodss {
        public static void main(String[] args) {
            TreeMap<String, Integer> treeMap = new TreeMap<>();

            treeMap.put("One", 1);
            treeMap.put("Two", 2);
            treeMap.put("Three", 3);
            treeMap.put("Four", 4);

            System.out.println("Using entrySet():");
            for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
            System.out.println("\nUsing keySet():");
            for (String key : treeMap.keySet()) {
                System.out.println("Key: " + key);
            }

            System.out.println("\nUsing values():");
            for (Integer value : treeMap.values()) {
                System.out.println("Value: " + value);
            }

            System.out.println("\nUsing forEach():");
            treeMap.forEach((key, value) -> System.out.println(key + " -> " + value));

            System.out.println("\nUsing NavigableMap methods:");
            System.out.println("First Entry: " + treeMap.firstEntry());

            System.out.println("Last Entry: " + treeMap.lastEntry());
            System.out.println("Poll First Entry: " + treeMap.pollFirstEntry());

            System.out.println("Poll Last Entry: " + treeMap.pollLastEntry());
            System.out.println("\nRemaining TreeMap: " + treeMap);
        }
    }


