package com.Listtt;

import java.util.LinkedList;

public class Listremove {
        public static void main(String args[])
        {
            LinkedList<String> list = new LinkedList<String>();
            list.add("Hello");
            list.add("for");
            list.add("Surya");
            list.add("10");
            list.add("20");
            System.out.println("LinkedList:" + list);
            list.remove();
            System.out.println("LinkedList:" + list);
            list.remove();

            System.out.println("Final LinkedList:" + list);
        }
    }


