package com.dreyyan.systemate;

// Imports: Standard Java
import java.util.Scanner;

public class Utility {
    static Scanner scanner = new Scanner(System.in); // Create an instance of 'Scanner'

    // [UTILITY]: Prompts the user to press any key to continue
    public static void pressToContinue() {
        System.out.println("Press any key to continue...");
        scanner.nextLine();
    }

    // [UTILITY]: Display error message to the console
    public static void errorMessage(String message, int msDelay) {
        System.out.println("ERROR: " + message);
        
        try {
            Thread.sleep(msDelay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // [UTILITY]: "Clear" the screen by pushing old content out of view
    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    // [UTILITY]: Display a {length}-wide line format using {symbol}
    public static void displayFormat(char symbol, int length) {
        for (int i = 0; i < length; ++i) {
            System.out.print(symbol);
        } System.out.println();
    }

    // [UTILITY]: Display the string /w delay
    public static void animatedPrint(String str, int msDelay) {
        for (char c : str.toCharArray()) {
            System.out.print(c);

            try {
                Thread.sleep(msDelay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}