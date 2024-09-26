package com.DayThree;

public class Pranthesis {

        public static void main(String[] args) {
            String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
            int openingPos = 10;
            int closingPos = findClosingParenthesis(sentence, openingPos);
            System.out.println("The corresponding closing parenthesis is at position: " + closingPos);
        }


        public static int findClosingParenthesis(String sentence, int openPos) {
            if (sentence.charAt(openPos) != '(') {
                throw new IllegalArgumentException("No opening parenthesis at the given position.");
            }
            int openParenthesisCount = 0;
            for (int i = openPos; i < sentence.length(); i++) {
                char currentChar = sentence.charAt(i);

                if (currentChar == '(') {
                    openParenthesisCount++;
                } else if (currentChar == ')') {
                    openParenthesisCount--;
                    if (openParenthesisCount == 0) {
                        return i;
                    }
                }
            }


            return -1;
        }
    }


