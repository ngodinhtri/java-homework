/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author ngodinhtri
 * @date 16-10-2020
 */
public class BT6 {

    //Check input a number
    public static double enterNumber() {
        Scanner input = new Scanner(System.in);
        double d = 0;
        boolean check = false;

        while (!check) {
            try {
                d = input.nextDouble();
                check = true;
            } catch (Exception e) {
                System.out.println("Please enter number. Try again!");
                input.nextLine();
            }
        }
        return d;
    }

    //Check input a integer
    public static int enterInteger() {
        Scanner input = new Scanner(System.in);
        int n = 0;
        boolean check = false;

        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Please enter integer. Try again!");
                input.nextLine();
            }
        }
        return n;
    }

    //Convert F to C
    public static double convertToCelsius(double fahrenheit) {
        return (double) 5.0 / 9.0 * (fahrenheit - 32);
    }

    //COnvert C to F
    public static double convertToFahrenheit(double celsius) {
        return (double) 9.0 / 5.0 * (celsius + 32);
    }

    public static void main(String[] args) {
        double celsius, fahrenheit = 0;
        int choice = 0;
        boolean check = false;
        //Menu
        System.out.println("---Menu---");
        System.out.println("1. Convert F to C");
        System.out.println("2. Convert C to F");
        //Check the choice
        do {
            System.out.print("Enter your choice: ");
            choice = enterInteger();
            if (choice < 3 && choice > 0) {
                check = true;
            }
        } while (!check);
        //Convert
        switch (choice) {
            case 1:
                System.out.print("Enter fahrenheit(F): ");
                fahrenheit = enterNumber();
                celsius = convertToCelsius(fahrenheit);
                System.out.println("Your result: " + celsius + " Celsius(C)");
                break;
            case 2:
                System.out.print("Enter celsius(C): ");
                celsius = enterNumber();
                fahrenheit = convertToFahrenheit(celsius);
                System.out.println("Your result: " + fahrenheit + " Fahrenheit(F)");
                break;
            default:
                break;
        }
    }
}
