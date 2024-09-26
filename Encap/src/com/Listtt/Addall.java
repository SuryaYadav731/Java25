package com.Listtt;
import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;

public class Addall {
        public static void main(String args[]) {
            LinkedList<String> list = new LinkedList<String>();
            list.add("Hi");
            list.add("for");
            list.add("Surya");
            list.add("10");
            list.add("20");

            Collection<String> collect = new ArrayList<String>();
            collect.add("A");
            collect.add("Computer");
            collect.add("Portal");
            collect.add("for");
            collect.add("home");

            System.out.println("The LinkedList is: " + list);

            list.addAll(collect);
            System.out.println("The new linked list is: " + list);

        }
    }


