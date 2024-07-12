echo 'package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Shetty\'s Moto Race!");

        // Display options
        System.out.println("Choose your vehicle:");
        System.out.println("1. Bike");
        System.out.println("2. Car");

        // Read user input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Display bike or car "photo" and message
        switch (choice) {
            case 1:
                System.out.println("You chose the Bike!");
                displayBike();
                break;
            case 2:
                System.out.println("You chose the Car!");
                displayCar();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }

    private static void displayBike() {
        System.out.println("  __o");
        System.out.println(" _ \\<,_");
        System.out.println("(*)/ (*)");
        System.out.println("Get ready to race with your bike!");
    }

    private static void displayCar() {
        System.out.println("  ______");
        System.out.println(" /|_||_\\`.__");
        System.out.println("(   _    _ _\\");
        System.out.println("=`-(_)--(_)-'");
        System.out.println("Get ready to race with your car!");
    }
}' > src/main/java/com/example/App.java
