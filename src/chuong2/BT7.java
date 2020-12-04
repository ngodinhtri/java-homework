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
public class BT7 {

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
        int[] arrResult = new int[6];       

        System.out.print("Nhập n lần tung xúc xắc:");
        int loop = nhap();
        //tạo 6 phần tử trong mảng đại diện cho số lần xuất hiện của 6 mặt
        for (int i = 0; i <= 5; i++) {
            arrResult[i] = 0;
        }
        //Đếm
        for (int i = 1; i <= loop; i++) {
            int result = randomDice();
            arrResult[result - 1]++; //vì random từ 1 - 6 nên tương ứng index 0 -5. ví dụ kq là 6 => arrResult[5]++ 
        }
        //In kết quả
        int idx = 1;
        for (int quanity : arrResult) {
            System.out.println("Mặt " + idx + " : " + quanity);
            idx++;
        }
    }

    //Hàm random m%ặt xúc xắc
    public static int randomDice() {
        return (int) (Math.random() * 6) + 1;
    }
}
