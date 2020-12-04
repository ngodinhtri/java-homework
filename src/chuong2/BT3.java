/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author ngodinhtri
 * @date 23-10-2020
 */
public class BT3 {

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;

        while (!check) {
            try {
                n = input.nextInt();
                if (n >= 0) {
                    check = true;
                } else {
                    System.out.print("Bạn cần nhập số nguyên dương: ");
                    input.nextLine();
                }
            } catch (Exception e) {
                System.out.print("Bạn cần nhập số nguyên dương: ");
                input.nextLine();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.print("nhập số nguyên dương:");
        int num = nhap();
        if (isEvenNum(num)) {
            for (int i = num; i > 2; i -= 2) {
                System.out.print(i + " + ");
            }
            System.out.print(2 + " = " + deQuyCongSo(num) + "\n");
        } else {
            for (int i = num; i > 1; i -= 2) {
                System.out.print(i + " + ");
            }
            System.out.print(1 + " = " + deQuyCongSo(num) + "\n");
        }
    }
    //Hàm kiểm tra số chẳn
    public static boolean isEvenNum(int n) {
        if (n % 2 != 0) {
            return false;
        }
        return true;
    }
    //Đệ quy cộng số
    public static int deQuyCongSo(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + deQuyCongSo(n - 2);
    }
}
