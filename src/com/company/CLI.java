package com.company;

import java.util.Scanner;

public class CLI {

    public static Scanner userIn = new Scanner(System.in);

    public static void yesNo() {
        System.out.print("Would you like to select another car?: ");

        String yn = userIn.next();
        switch (yn) {
            case "Y", "y", "Yes", "yes" -> System.out.println("");
            case "N", "n", "no", "No" -> Main.check = false;
        }
    }

}
