package com.Stackk;
import java.util.HashSet;
public class HashSett {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");
            System.out.println("Original HashSet: " + set);
            set.add("Date");
            System.out.println("Updated HashSet: " + set);
        }
    }


