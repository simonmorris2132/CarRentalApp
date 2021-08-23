package com.company;

public class Main {

    static boolean check = true;

    public static void start() {

        System.out.println("Welcome to the Car Rental Company!\n");


    }
}


/*notes for Car Rental Project
To restart the program: have a start() method called that will initialize our menus and reset our methods as if it were being ran for the first time.

* Main class:
* will be calling the run method in the CarRentalService class
*
* CLI class:
* add some fail safe scanners that is careful about what the user puts into the program.
*
* CarRentalService/Menu? Class:
* will contain atleast one method that will be called in the main.
* should contain a submenu method which will ask the user wants to return to the main menu or not.

menu options:
for (string car : carsAval) ... for(int i = 0...;i++) i + 1
    sout(carsAval[cars].name().model().color())

    .size for arraylist
    .contains

    restart...method that calls the start.
    store the user input into a variable for it to run the menu again...
    new instance of the menu...
    initialCars = create the cars using inheritance from the car class. initialize in start method and restart method.


*
* Car Class:
* Multiple menus?
* Inheritance?
* Body: Economy? Mid size? compact? sport?
* Price?
* Color
* Name
* Model
* boolean isElectric?
* boolean isStandard? (transmission)
*
* methods?
* getters and setters
* getPrice?
getCar method (Object car)
reference the car inside the arraylist
return car.color() + car.model()
*
* Override toString method?
* display method

do while loop will run as long as there are cars in the arraylist.

*
*
* Inventory class:??
* Listed inside a string array
* ArrayLists?
* A rented cars list?
* any and all information about the cars
* boolean for is or isn't rented
* have two: rented and not rented.
* while loop for checking inventory
* while there is inventory in carsAvailable list, continue to rent a car
* while there is no inventory in carsAvailable list, ask if the user wants to end the program or restart the program.
* recall the main.start() method to restart the entire program.
*
*numbers of cars, which ones are rented, available cars.
boolean isRented
date rented?? (extra)
method that changes the boolean of isRented ... rented()
ArrayList named rented
ArrayList named inInventory

when is empty...start the menu.
* */