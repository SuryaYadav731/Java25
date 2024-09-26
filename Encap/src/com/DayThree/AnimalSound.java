package com.DayThree;
import java.util.Scanner;

    class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }
    }
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows.");
        }
    }

    public class AnimalSound {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Which animal would you like to create?");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.print("Enter your choice (1 or 2): ");

            int choice = scanner.nextInt();
            Animal animal;

            if (choice == 1) {
                animal = new Dog();
            } else if (choice == 2) {
                animal = new Cat();
            } else {
                System.out.println("Invalid choice, creating a generic animal.");
                animal = new Animal();
            }

            animal.makeSound();
            scanner.close();
        }
    }

