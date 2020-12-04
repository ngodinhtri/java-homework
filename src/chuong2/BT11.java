/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

/**
 *
 * @author ngodi
 */
public class BT11 {
    public static void main(String[] args) {
        //Khởi tạo  
        Diem diem1 = new Diem(2,1); //Điểm góc trái trên hcn1
        Diem diem2 = new Diem(4,-1); //Điểm góc trái trên hcn2, cũng nằm trong hcn1
        Diem diem3 = new Diem(-2,1); //Điểm nằm ngoài hcn1
        
        HinhChuNhat hcn1 = new HinhChuNhat(diem1, 4, 3);
        HinhChuNhat hcn2 = new HinhChuNhat(diem2, 3, 4);
        HinhChuNhat hcn3 = new HinhChuNhat(diem3, 1, 1);
        
        
        System.out.println("Ta có "+hcn1.toString());
        System.out.println("Điểm" + diem2.toString()+" thuộc hình chữ nhật trên? " + hcn1.thuocHinhChuNhat(diem2));
        System.out.println("Điểm" + diem3.toString()+" thuộc hình chữ nhật trên? " + hcn1.thuocHinhChuNhat(diem3));
        System.out.println("\nHình" + hcn2.toString()+" có giao với hình chữ nhật trên? " + hcn1.giaoNhau(hcn2));
        System.out.println("Hình" + hcn3.toString()+" có giao với hình chữ nhật trên? " + hcn1.giaoNhau(hcn3));
        
        System.out.println("\n\nHình" + hcn2.toString()+" có giao với hình chữ nhật trên với diện tích là: " + hcn1.tinhDienTichGiaoNhau2HinhChuNhat(hcn2));
    }
}
