package com.Collectionn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverss {
    public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();
            stringList.add("apple");
            stringList.add("banana");
            stringList.add("cherry");
            stringList.add("date");
            System.out.println("Original List: " + stringList);
            Collections.reverse(stringList);

            System.out.println("Reversed List: " + stringList);
        }
    }


