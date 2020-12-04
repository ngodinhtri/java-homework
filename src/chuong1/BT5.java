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
public class BT5 {

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

    public static String convertTime(int amountOfSeconds) {
        String sResult = "";
        int hour, minute, second = 0;

        hour = amountOfSeconds / 3600;
        minute = (amountOfSeconds % 3600) / 60;
        second = amountOfSeconds % 60;

        sResult = String.valueOf(hour) + ":" + String.valueOf(minute) + ":" + String.valueOf(second);

        return sResult;
    }

    public static void main(String[] args) {
        int amountOfSeconds = 0;
        String sResult = "";

        System.out.print("Enter amount of seconds: ");
        amountOfSeconds = enterInteger();

        sResult = convertTime(amountOfSeconds);

        System.out.println("Result: " + sResult);
    }
}
