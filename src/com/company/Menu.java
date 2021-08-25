package com.company;

import java.util.ArrayList;

public class Menu {

    Inventory inv = new Inventory();
    ArrayList<Car> arrList = inv.getCarsAval();
    CLI userInput = new CLI();
    ArrayList<Car> rented = inv.getRentedCars();

    public void start() {
        System.out.println("Welcome to the Car Rental Company!");
        inv.initializeCars();
        run();
    }

    public void run() {

        System.out.println("\n---\nWe have a total of " + arrList.size() + " cars available and " + rented.size() + " cars being rented.");
        System.out.println("\nChoose from the following menus: ");
        System.out.println("1. Rent a car");
        System.out.println("2. Return a car");

        int input = userInput.getInt(1, 2);

        if (input == 1) {

        }

            System.out.println("Please choose the car you wish to rent!");
            int selection = userInput.getInt(1, arrList.size());

            for (int i = 0; i < arrList.size(); i++) {
                if (selection - 1 == i) {
                    rentedTotal(i);
                    rented.add(arrList.get(i));
                    arrList.remove(i);
                    run();
                }

            }

        }

    private void subMenu() {
        System.out.println("\nThank you for choosing The Car Rental Company! What would you like to do from this point?");
        System.out.println("1) Restart this program and refresh the lot");
        System.out.println("2) Exit the program");
        int selection = userInput.getInt(1, 2);

        if (selection == 1) {
            System.out.println("\n---\nRestarting the program!\n---");
            start();
        } else {
            new CLI().exit();
        }
    }

    private void rentedTotal(int i){
        System.out.println(i);
        System.out.println("\n---\nThank you for choosing the " + arrList.get(i) + "! The price per day is " + arrList.get(i).getPrice() + ". How many days do you wish to rent it?\n---");
        int input = userInput.getInt();
        int total = input * arrList.get(i).getPrice();
        System.out.println("\n---\n For a " + input + " day rental the " + arrList.get(i) + " will cost a total of "  + total + "! Safe Travels!\n---");

    }

}