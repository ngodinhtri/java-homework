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
public class BT8 {

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

    public static int tinhUCLN(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
            }
            if (num1 < num2) {
                num2 -= num1;
            }
        }
        return num1;
    }

    public static int tinhBCNN(int num1, int num2) {
        return (num1 * num2) / tinhUCLN(num1, num2);
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        System.out.print("Nhập số thứ 1: ");
        num1 = enterInteger();
        System.out.print("Nhập số thứ 2: ");
        num2 = enterInteger();
        System.out.printf("UCLN của %d và %d là %d\n", num1, num2, tinhUCLN(num1, num2));
        System.out.printf("BCNN của %d và %d là %d\n", num1, num2, tinhBCNN(num1, num2));
    }
}
