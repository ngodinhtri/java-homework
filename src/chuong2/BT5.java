/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.util.Scanner;

/**
 * Viết chương trình random giữa 2 số.
 *
 * @author ngodinhtri
 * @date 28-10-2020
 */
public class BT5 {

    public static void main(String[] args) {
        System.out.print("Nhập số thứ 1: ");
        int num1 = nhap();
        System.out.print("Nhập số thứ 1: ");
        int num2 = nhap();
        
        int max=0, min=0;
        
        if(num1>num2)
        {
            max = num1;
            min = num2;
        }else{
            min = num1;
            max = num2;
        }
        
        System.out.print("Số ngẫu nhiên giữa 2 số " + max + " và " + min + " là: "+ random2Nums(max, min)+"\n");
    }

    //nhập()
    public static int nhap() {
        Scanner inp = new Scanner(System.in);
        int num = 0;
        boolean check = false;

        while (!check) {
            try {
                num = inp.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.print("Bạn cần nhập số: ");
                inp.nextLine();
            }
        }
        return num;
    }

    public static int random2Nums(int max, int min) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
