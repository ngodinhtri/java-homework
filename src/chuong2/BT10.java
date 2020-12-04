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
public class BT10 {
    public static void main(String[] args) {
        Diem diem1 = new Diem(2,1);
        Diem diem2 = new Diem(6,4);
        
        System.out.println("Ta có "+diem1.toString());
        System.out.println("Khoảng cách tới gốc tọa độ: " + diem1.tinhKhoangCachToiGocToaDo());
        System.out.println("Khoảng cách tới điểm " + diem2.toString() +" : "+diem1.tinhKhoangCach2Diem(diem2));
    }
}
