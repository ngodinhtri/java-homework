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
 * @date 29-10-2020
 */
public class BT8 {

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int num = 0;
        while (!check) {
            try {
                num = input.nextInt();
                if (num < 0) {
                    System.out.print("Bạn cần nhập số dương:");
                    input.nextLine();
                } else {
                    check = true;
                }
            } catch (Exception e) {
                System.out.print("Bạn cần nhập số dương:");
                input.nextLine();
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int soThuNhat = (int) (Math.random() * 10) + 1;
        int soThuHai = 0;
        do {
            soThuHai = (int) (Math.random() * 10) + 1;
        } while (soThuNhat + soThuHai > 10);

        System.out.printf("%d + %d = ?\n", soThuNhat, soThuHai);
        System.out.print("Kết quả: ");
        int ketQua = nhap();

        if (ketQua != (soThuNhat + soThuHai)) {
            randomLoiDongVien();
        } else {
            randomLoiKhen();
        }
    }

    public static void randomLoiKhen() {
        String[] mangLoiKhen = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};

        int rand = (int) (Math.random() * 4);
        System.out.println(mangLoiKhen[rand]);
    }

    public static void randomLoiDongVien() {
        String[] mangLoiDongVien = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "Wrong. Keep trying."};

        int rand = (int) (Math.random() * 4);
        System.out.println(mangLoiDongVien[rand]);
    }
}
