package com.Listtt;
import java.util.LinkedList;

public class ListGet {
        public static void main(String args[]) {
            LinkedList<String> list = new LinkedList<String>();
            list.add("Hello");
            list.add("for");
            list.add("surya");
            list.add("10");
            list.add("20");
            System.out.println("LinkedList:" + list);

            System.out.println("The element is: " + list.get(2));

        }
    }


