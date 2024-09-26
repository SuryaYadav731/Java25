package com.Queu;
import java.util.*;
public class PeekQue {
        public static void main(String args[])
        {

            PriorityQueue<String> queue = new PriorityQueue<String>();
            queue.add("Javascript");
            queue.add("Java");
            queue.add("Python");
            queue.add("Bootstrap");
            queue.add("HEllo");

            System.out.println("Initial PriorityQueue: " + queue);
            System.out.println("The element at the head of the"
                    + " queue is: " + queue.peek());

            System.out.println("Final PriorityQueue: " + queue);
        }
    }


