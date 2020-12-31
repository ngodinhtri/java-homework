/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ngodi
 */
public class Demo_QLSV {

    public static void main(String[] args) {
        ArrayList<SinhVien> alSV = new ArrayList<SinhVien>();

        alSV.add(new SinhVien(1, "Thang", 18));
        alSV.add(new SinhVien(2, "Quang", 16));
        alSV.add(new SinhVien(3, "Trinh", 19));
        alSV.add(new SinhVien(4, "Anh", 17));
        alSV.add(new SinhVien(5, "Cuong", 18));
        alSV.add(new SinhVien(6, "Trinh", 17));
        alSV.add(new SinhVien(7, "Phong", 16));
        alSV.add(new SinhVien(8, "Tri", 19));
        alSV.add(new SinhVien(9, "Quang", 20));

         System.out.println("\nSắp xếp theo tuổi: ");
        Collections.sort(alSV, new AgeComparator());
        for (SinhVien sv : alSV) {
            System.out.println(sv.toString());
        }

        System.out.println("\nSắp xếp theo tên: ");
        Collections.sort(alSV, new NameComparator());
        for (SinhVien sv : alSV) {
            System.out.println(sv.toString());
        }
        //Tuổi trung nhau thì sắp xếp theo tên
        System.out.println("\nSắp xếp theo tuổi rồi tới tên: ");
        Collections.sort(alSV, new AgeNameComparator());
        for (SinhVien sv : alSV) {
            System.out.println(sv.toString());
        }
         //Tên trung nhau thì sắp xếp theo tên
        System.out.println("\nSắp xếp theo tên rồi tới tuổi: ");
        Collections.sort(alSV, new NameAgeComparator());
        for (SinhVien sv : alSV) {
            System.out.println(sv.toString());
        }
    }
}
