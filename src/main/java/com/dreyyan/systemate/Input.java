package com.dreyyan.systemate;

// Imports: Standard Java
import java.util.InputMismatchException;
import java.util.Scanner;

// Imports: Project
import com.dreyyan.systemate.Utility;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    // METHODS
    // [UTILITY]: Get an integer input from the user
    public static int getInt(String prompt) {
        while (true) { 
            System.out.print(prompt);
            
            try {
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                Utility.errorMessage("Invalid input, please enter a valid number", 3); 
            } 
        }
    }

    // [UTILITY]: Get a floating number input from the user
    public static float getFloat(String prompt) {
        while (true) { 
            System.out.print(prompt);
            
            try {
                float input = scanner.nextFloat();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                Utility.errorMessage("Invalid input, please enter a valid decimal number", 3); 
            } 
        }
    }

    // [UTILITY]: Get a double input from the user
    public static double getDouble(String prompt) {
        while (true) { 
            System.out.print(prompt);
            
            try {
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                Utility.errorMessage("Invalid input, please enter a valid decimal number", 3); 
            } 
        }
    }

    // [UTILITY]: Get a char input from the user
    public static char getChar(String prompt) {
        while (true) { 
            System.out.print(prompt);
            
            try {
                char input = scanner.nextLine().charAt(0);
                return input;
            } catch (InputMismatchException e) {
                Utility.errorMessage("Invalid input, please enter a valid string", 3); 
            } 
        }
    }

    // [UTILITY]: Get a string input from the user
    public static String getString(String prompt) {
        while (true) {
            System.out.print(prompt);
            
            try {
                String input = scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                Utility.errorMessage("Invalid input, please enter a valid string", 3); 
            } 
        }
    }

    // [UTILITY]: Get a boolean input from the user
    public static boolean getBool(String prompt) {
        while (true) {
            System.out.print(prompt);
            
            try {
                boolean input = scanner.nextBoolean();
                return input;
            } catch (InputMismatchException e) {
                Utility.errorMessage("Invalid input, please enter a valid boolean", 3); 
            } 
        }
    }
}
