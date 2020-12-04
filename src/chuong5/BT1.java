/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.util.ArrayList;

/**
 *
 * @author ngodi
 */
public class BT1 {

    public static void main(String[] args) {
        //Thêm  Stored Procedure
        DatabaseUtil.tao_sp_them_SinhVien();
        DatabaseUtil.tao_sp_xoa_SinhVien();
        DatabaseUtil.tao_sp_sua_SinhVien();
        DatabaseUtil.tao_sp_lay_DS_SinhVien();

        //Tạo Sinh Viên
        SinhVien sv1 = new SinhVien("Ngo Dinh Tri", "18211", "ngodinhtri@email.com", "0123456789");
        SinhVien sv2 = new SinhVien("Doan Hong Thang", "19211", "doanhongthang@email.com", "9876543210");

        //Thêm vào csdl
        System.out.println("\n");
        SinhVienDAO.themSinhVien(sv1);
        SinhVienDAO.themSinhVien(sv2);

        //In ra dssv từ csdl
        System.out.println("\n\nDanh sách SV mới tạo:");
        ArrayList<SinhVien> arrSV = SinhVienDAO.layDSSV();
        for (SinhVien item : arrSV) {
            System.out.println(item.toString());
        }

        //Sửa SV
        sv2.setHoTen("Sinh Vien 2");
        
        //Cập nhật xuống csdl
        SinhVienDAO.suaSinhVien(sv2);
        
        //In ra dssv từ csdl
        System.out.println("\n\nDanh sách SV sau khi sửa:");
        arrSV = SinhVienDAO.layDSSV();
        for (SinhVien item : arrSV) {
            System.out.println(item.toString());
        }
        
        //Xóa SV 
        SinhVienDAO.xoaSinhVien("18211");
        
        //In ra dssv từ csdl
        System.out.println("\n\nDanh sách SV sau khi xóa:");
        arrSV = SinhVienDAO.layDSSV();
        for (SinhVien item : arrSV) {
            System.out.println(item.toString());
        }
        
        //Đóng CSDL
        DatabaseUtil.dongCSDL();
    }
}
