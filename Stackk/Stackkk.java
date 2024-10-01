package com.Stackk;
import java.util.Stack;

public class Stackkk {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 1; i <= 10; i++) {
                stack.push(i);
            }
            System.out.println("Original Stack: " + stack);

            for (int i = 0; i < 4; i++) {
                stack.pop();
            }

            System.out.println("Stack after removing 4 elements: " + stack);
        }
    }


