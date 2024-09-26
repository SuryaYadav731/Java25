package com.Listtt;

import java.util.LinkedList;

public class linkset {
        public static void main(String args[])
        {
            LinkedList<String> list = new LinkedList<String>();
            list.add("Hello");
            list.add("for");
            list.add("Surya");
            list.add("10");
            list.add("20");

            System.out.println("LinkedList:" + list);
            System.out.println(
                    "The Object that is replaced is: "
                            + list.set(3, "Yadav"));

            System.out.println("The Object that is replaced is: "
                            + list.set(4, "50"));

            System.out.println("The new LinkedList is:" + list);
        }
    }


