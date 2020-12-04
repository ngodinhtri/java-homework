/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

/**
 *
 * @author ngodinhtri
 * @date 4-11-2020
 */
public class BT9 {

    public static void main(String[] args) {
        //Tối giản
        System.out.println("Tối giản phân số");
        PhanSo ps = new PhanSo(3, 9);
        System.out.println(ps.toString() + " sau khi toi gian: "+ ps.toiGian().toString());
        
        //Tổng 2 Ps
        System.out.println("Tổng phân số");
        PhanSo ps1 = new PhanSo(3, 9);
        PhanSo ps2 = new PhanSo(2, 4);
        PhanSo ps3 = ps1.congPhanSo(ps2);
        System.out.println(ps1.toString() + " + "+ ps2.toString() + " = " + ps3.toString());
        
        //Hiệu 2 Ps
        System.out.println("Hiệu phân số");
         ps3 = ps1.truPhanSo(ps2);
        System.out.println(ps1.toString() + " - "+ ps2.toString() + " = " + ps3.toString());
        
        //Tích 2 Ps
        System.out.println("Tích phân số");
         ps3 = ps1.nhanPhanSo(ps2);
        System.out.println(ps1.toString() + " * "+ ps2.toString() + " = " + ps3.toString());
        
        //Thương 2 Ps
        System.out.println("Thương phân số");
         ps3 = ps1.chiaPhanSo(ps2);
        System.out.println(ps1.toString() + " : "+ ps2.toString() + " = " + ps3.toString());
    }
}
