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
 * @date 28-10-2020
 */
public class BT2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = ""; // Chuỗi người dùng nhập
        String result = "";
        String[] arrStr; //Mảng tách chuỗi

        System.out.print("Nhập: ");
        s = input.nextLine();

        s = s.trim(); //bỏ khoảng trắng đầu và cuối đoạn văn nhập vào
        arrStr = s.split(" "); //Tách chuỗi thành mảng

        for (String word : arrStr) {
            word = boKhoangTrang(word); // loại bỏ khoảng trắng nếu có
            if (word.length() == 0) {
                continue; //Nếu word sau khi bỏ khoảng trắng là rỗng thì bỏ qua
            }
            result += word.charAt(0); //Lấy kí tự đầu mỗi từ
        }

        result = result.toUpperCase(); //In hoa tất cả
        System.out.println("Kết quả: " + result);
    }

    public static String boKhoangTrang(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            r += s.charAt(i);
        }
        return r;
    }
}
