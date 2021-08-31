package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {

    Scanner scanner = new Scanner(System.in);

    public int getInt(int min, int max) {
        try {
            System.out.print("Input: ");
            int input = scanner.nextInt();
            if (input > max || input < min) {
                System.out.println("Input is out of range. Please try again.");
                return getInt(min, max);
            }
            return input;
        } catch (InputMismatchException exception) {
            System.out.println("Incorrect input. Please provide a number and try again.");
            scanner.nextLine();
            return getInt(min, max);
        } catch (Exception exception) {
            System.out.println("An unknown error appeared.");
            scanner.nextLine();
            return getInt(min, max);
        }
    }

    public void exit() {
        System.out.println("\nThank you for stopping by!\n");
        System.exit(0);
    }

    public int getInt() {
        System.out.print("Input: ");
        int input = scanner.nextInt();
        return input;
    }


    public String getString(String input) {
        try {
            System.out.print("Input: ");
            String userInput = scanner.nextLine().trim();

            if (userInput == " ") {
                System.out.println("Your input cannot be empty! Please try again.");
                return getString(input);
            }
            return input;
        } catch (InputMismatchException exception) {
            System.out.println("Incorrect input! Please provide a word or phrase and try again.");
            scanner.nextLine();
            return getString(input);
        } catch (Exception exception) {
            System.out.println("An unknown error appeared.");
            scanner.nextLine();
            return getString(input);
        }
    }

    public String getString() {
        String input = scanner.nextLine();
        return input;
    }

}