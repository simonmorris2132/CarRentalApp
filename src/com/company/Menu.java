package com.company;

import java.util.ArrayList;

public class Menu {

    Inventory inv = new Inventory(); //to initialize an instance of inventory once
    ArrayList<Car> arrList = inv.getCarsAval();
    CLI userInput = new CLI(); //to only initialize an instance of CLI once
    ArrayList<Car> rented = inv.getRentedCars();

    public void start() {//introduces the program and populates carsAval arraylist
        System.out.println("Welcome to the Car Rental Company!");
        inv.initializeCars();
        run();
    }

    public void run() {//The main menu of the program
        System.out.println("\nWe have a total of " + arrList.size() + " cars available for rent and we have " + rented.size() + " cars currently being rented.");
        System.out.println("\nChoose from the following menu options:");
        System.out.println("1) Rent a car");
        System.out.println("2) Return a car");
        System.out.println("3) Exit the program");

        int input = userInput.getInt(1, 3);

        if (input == 1){
            renting();
        }
        else if (input == 2){
            returnCar();
        }else {
            new CLI().exit();
        }
    }

    public void renting() {

        while (arrList.size() != 0) {
            inv.showMenu();  //loops through carsAval and creates and changes the list as it goes.

            System.out.println("Please choose the car you wish to rent!");
            int selection = userInput.getInt(1, arrList.size());

            for (int i = 0; i < arrList.size(); i++) {
                if (selection - 1 == i) {
                    rentedTotal(i); //takes input of how many days customer wants
                    rented.add(arrList.get(i));
                    arrList.remove(i);
                    subMenu();
                }
            }
        }
    }

    private void returnCar() {
        if (rented.size() == 0){
            System.out.println("\nWe have no cars out for rent! Returning to main menu...\n2" + "");
            run();
        }

        while (rented.size() != 0){
            inv.showRentedMenu(); //loops through rentedCars and creates and changes list as it continues.

            System.out.print("\nInput:");
            int selection = userInput.getInt(1, rented.size());

            for (int i = 0; i < rented.size(); i++){
                if (selection - 1 == i){
                    System.out.println("\nThank you for returning the " + rented.get(i) + "! We hope to see you again.\n");
                    arrList.add(rented.get(i));
                    rented.remove(i);
                    subMenu();
                }
            }
        }
    }

    private void subMenu() {
        subMenuDialogue();
        int selection = userInput.getInt(1, 5);
        userSelection(selection);
    }

    private void subMenuDialogue() {
        System.out.println("\nThank you for choosing Taylor's Car Rental Service! What would you like to do from this point?");
        System.out.println("1) Restart this program and refresh the lot");
        System.out.println("2) Return to the main menu.");
        System.out.println("3) Go to the rental menu to rent a car.");
        System.out.println("4) Go to the return menu to return a car.");
        System.out.println("5) Exit the program");
    }

    private void userSelection(int selection) {
        if (selection == 1) {
            System.out.println("\nRestarting the program!\n---");
            arrList.clear();
            rented.clear();
            start();
        }else if(selection == 2){
            System.out.println("\nReturning to the main menu.\n---");
            run();
        }
        else if (selection == 3){System.out.println("\nSending you to the rental menu.\n---");
            renting();
        }
        else if (selection == 4){System.out.println("\nAlrighty! Sending you to the return menu.\n---");
            returnCar();
        }else {
            new CLI().exit();
        }
    }

    private void rentedTotal(int i){
        System.out.println(i);
        System.out.println("\nThank you for choosing the " + arrList.get(i).getDetails() + "! The price per day is " + arrList.get(i).getPrice() + ". How many days do you wish to rent it?\n");
        int input = userInput.getInt();
        int total = input * arrList.get(i).getPrice();
        System.out.println("\nFor a " + input + " day rental the " + arrList.get(i).getDetails() + " will cost a total of $"  + total + "!\n");

    }
}