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
 * @date 17-10-2020
 */
public class BT7 {

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

    //Check input a number
    public static double enterNumber() {
        Scanner input = new Scanner(System.in);
        double d = 0.0;
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

    public static double getBMIPoundsInches(double wPounds, double hInches) {
        return (wPounds * 703) / (hInches * hInches);
    }

    public static double getBMIKilogramsMeters(double wKilograms, double hMeters) {
        return (wKilograms) / (hMeters * hMeters);
    }

    public static void printResultBMI(double bmi) {
        System.out.println("Your BMI: " + bmi);
        if (bmi >= 30) {
            System.out.println("You are obese ");
        } else if (bmi >= 25) {
            System.out.println("You are overweight ");
        } else if (bmi > 18.5) {
            System.out.println("You are normal ");
        } else {
            System.out.println("You are underweight ");
        }

    }

    public static void main(String[] args) {
        double bmi = 0, weight, height = 0.0;
        int choice = 0;
        boolean check = false;
        //Menu
        System.out.println("---Menu---");
        System.out.println("1. BMI (Pounds/Inches)");
        System.out.println("2. BMI (Kilograms/Meters)");
        //Check the choice
        do {
            System.out.print("Enter your choice: ");
            choice = enterInteger();
            if (choice < 3 && choice > 0) {
                check = true;
            }
        } while (!check);

        switch (choice) {
            case 1:
                System.out.print("Enter weight(Pounds): ");
                weight = enterNumber();
                System.out.print("Enter height(Inches): ");
                height = enterNumber();
                bmi = getBMIPoundsInches(weight, height);
                break;
            case 2:
                System.out.print("Enter weight(Kilograms): ");
                weight = enterNumber();
                System.out.print("Enter height(Meters): ");
                height = enterNumber();
                bmi = getBMIKilogramsMeters(weight, height);
                break;
            default:
                break;
        }
        printResultBMI(bmi);
    }
}
