/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7;

/**
 *
 * @author ngodi
 */
public class BT4 {
    public static void main(String[] args) {
        BoBai bobai1 = new BoBai();
        
        System.out.println("Bộ bài 52 cây: ");
        System.out.println(bobai1.toString());
        
        System.out.println("\nTrộn bài: ");
        bobai1.tronBai();
        System.out.println(bobai1.toString());
        
        System.out.println("\nSắp xếp bài theo thứ tự: ");
        bobai1.sapXepTheoThuTuRoiLoai();
        System.out.println(bobai1.toString());
        
        System.out.println("\nSắp xếp bài theo loại: ");
        bobai1.sapXepTheoLoaiRoiThuTu();
        System.out.println(bobai1.toString());
    }
}
