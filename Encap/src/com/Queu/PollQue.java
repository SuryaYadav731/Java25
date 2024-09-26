package com.Queu;
import java.util.*;
public class PollQue {
    // Java code to illustrate poll()



        public static void main(String args[])
        {
            PriorityQueue<String> queue = new PriorityQueue<String>();


            queue.add("JAVA");
            queue.add("PYTHON");
            queue.add("JAVASCRIPT");
            queue.add("C++");
            queue.add("C");

            System.out.println("Initial PriorityQueue: " + queue);
            System.out.println("The element at the head of the"
                    + " queue is: " + queue.poll());
            System.out.println("Final PriorityQueue: " + queue);
        }
    }


