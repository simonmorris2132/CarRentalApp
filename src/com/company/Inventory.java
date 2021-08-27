package com.company;

import java.util.ArrayList;

public class Inventory {

    public ArrayList<Car> carsAval = new ArrayList<>();

    public ArrayList<Car> rentedCars = new ArrayList<>();

    public void initializeCars() {
        Car car1 = new Car("Hyundai Elantra", "Black", 250, false);
        carsAval.add(car1);

        Car car2 = new Car("Ford Mustang", "Red", 400, false);
        carsAval.add(car2);

        Car car3 = new Car("Volvo E36", "Grey", 400, false);
        carsAval.add(car3);

        Car car4 = new Car("Chevy Volt", "Yellow", 600, false);
        carsAval.add(car4);

        Car car5 = new Car("VW Beatle", "Blue", 275, false);
        carsAval.add(car5);
    }

    public void showMenu() {//possibly cutting down on the code needed in other classes.
        System.out.println("\nThis is our current selection of rental cars:");
        for (int i = 0; i < carsAval.size(); i++) {
            System.out.println(i + 1 + ") " + carsAval.get(i).getDetails());
        }
    }

    public void showRentedMenu() {
        System.out.println("Welcome back! Which car would you like to return?");
        for (int i = 0; i < rentedCars.size(); i++){
            System.out.println(i + 1 + ". " + "" + rentedCars.get(i).getDetails());
        }
    }

    public ArrayList<Car> getCarsAval() {
        return carsAval;
    }

    public ArrayList<Car> getRentedCars() {
        return rentedCars;
    }
}