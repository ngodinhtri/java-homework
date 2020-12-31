/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDe2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import chuong8.De2.*;
import java.util.ArrayList;

/**
 *
 * @author ngodi
 */
public class MyTest1 {
    
    @Test
    public void testSanPhamHinhChuNhat_Normal() {                   //(1 diem)
        SanPhamHinhChuNhat hcn = new SanPhamHinhChuNhat(20, 50, 9.5);
        String actual = hcn.toString();
        String expected = "SanPhamHinhChuNhat(20, 50, 9.5)";
        assertEquals(actual, expected);

        double actual2 = hcn.tinhDienTich();
        double expected2 = 1000;
        assertEquals(expected2, actual2, 0.0001);

    }

    @Test(expected = IllegalArgumentException.class)              //(0.5 diem)
    public void testSanPhamHinhChuNhat_AbNormal() {
        SanPhamHinhChuNhat hcn1 = new SanPhamHinhChuNhat(-20, 50, 9);
        SanPhamHinhChuNhat hcn2 = new SanPhamHinhChuNhat(90, -65, 1.5);
        SanPhamHinhChuNhat hcn3 = new SanPhamHinhChuNhat(90, -65, -16.5);
    }

    @Test
    public void testSanPhamHinhTron_Normal() {                      //(1 diem)
        SanPhamHinhTron ht = new SanPhamHinhTron(20, 9.5);
        String actual = ht.toString();
        String expected = "SanPhamHinhTron(20, 9.5)";
        assertEquals(actual, expected);

        double actual2 = ht.tinhDienTich();
        double expected2 = 1256;
        assertEquals(expected2, actual2, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)              //(0.5 diem)
    public void testSanPhamHinhTron_AbNormal() {
        SanPhamHinhTron ht1 = new SanPhamHinhTron(20, -9);
        SanPhamHinhTron ht2 = new SanPhamHinhTron(-65, 18.5);
    }

    @Test
    public void testTinhTongDienTichSanPhamHinhChuNhat() {          //(2 diem)
        // dien tich hcn = chieuDai * chieuRong
        // dien tich hinh tron = banKinh * banKinh * 3.14

        SanPham hcn1 = new SanPhamHinhChuNhat(20, 50, 17.5);    //1000        
        SanPham hcn2 = new SanPhamHinhChuNhat(90, 30, 16.5);    //2700      
        SanPham hcn3 = new SanPhamHinhChuNhat(50, 8, 17.5);     // 400
        SanPham ht1 = new SanPhamHinhTron(5, 14.5);
        SanPham ht2 = new SanPhamHinhTron(9, 8.5);
        SanPham ht3 = new SanPhamHinhTron(16, 15.5);

        QuanLySanPham quanLySanPham = new QuanLySanPham();
        quanLySanPham.themSanPham(hcn1);
        quanLySanPham.themSanPham(hcn2);
        quanLySanPham.themSanPham(ht1);
        quanLySanPham.themSanPham(ht2);
        quanLySanPham.themSanPham(ht3);
        quanLySanPham.themSanPham(hcn3);

        double actual = quanLySanPham.tinhTongDienTichSanPhamHinhChuNhat();
        double expected = 4100;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testTimSanPhamCoTrongLuongMax() {                   //(2 diem)
        SanPham hcn1 = new SanPhamHinhChuNhat(20, 50, 17.5);
        SanPham hcn2 = new SanPhamHinhChuNhat(90, 30, 16.5);
        SanPham hcn3 = new SanPhamHinhChuNhat(50, 8, 17.5);
        SanPham ht1 = new SanPhamHinhTron(5, 14.5);
        SanPham ht2 = new SanPhamHinhTron(9, 8.5);
        SanPham ht3 = new SanPhamHinhTron(16, 15.5);

        QuanLySanPham quanLySanPham = new QuanLySanPham();
        quanLySanPham.themSanPham(hcn1);
        quanLySanPham.themSanPham(ht1);
        quanLySanPham.themSanPham(ht2);
        quanLySanPham.themSanPham(ht3);
        quanLySanPham.themSanPham(hcn2);
        quanLySanPham.themSanPham(hcn3);

        ArrayList<SanPham> dsSpTrongLuongMax = quanLySanPham.layDsSanPhamCoTrongLuongMax();

        assertEquals(2, dsSpTrongLuongMax.size());
        assertEquals(hcn1.getTrongLuong(), dsSpTrongLuongMax.get(0).getTrongLuong());
    }

    @Test
    public void testTinhTongTrongLuongTheoLoai() {                  //(1 diem)
        SanPham hcn1 = new SanPhamHinhChuNhat(20, 50, 17.5);
        SanPham hcn2 = new SanPhamHinhChuNhat(90, 30, 6.5);
        SanPham hcn3 = new SanPhamHinhChuNhat(50, 8, 17.5);
        SanPham ht1 = new SanPhamHinhTron(5, 14.5);
        SanPham ht2 = new SanPhamHinhTron(9, 8.5);
        SanPham ht3 = new SanPhamHinhTron(16, 15.5);

        QuanLySanPham quanLySanPham = new QuanLySanPham();
        quanLySanPham.themSanPham(hcn1);
        quanLySanPham.themSanPham(ht1);
        quanLySanPham.themSanPham(ht2);
        quanLySanPham.themSanPham(ht3);
        quanLySanPham.themSanPham(hcn2);
        quanLySanPham.themSanPham(hcn3);

        double actual = quanLySanPham.tinhTongTrongLuongTheoLoai(SanPham.LOAI_SP_HINH_TRON);
        double expected = 38.5;
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testSapXepTrongLuongTangDan() {                     //(1 diem)
        SanPham hcn1 = new SanPhamHinhChuNhat(20, 50, 17.5);
        SanPham hcn2 = new SanPhamHinhChuNhat(90, 30, 6.5);
        SanPham hcn3 = new SanPhamHinhChuNhat(50, 8, 17.5);
        SanPham ht1 = new SanPhamHinhTron(5, 14.5);
        SanPham ht2 = new SanPhamHinhTron(9, 8.5);
        SanPham ht3 = new SanPhamHinhTron(16, 15.5);

        QuanLySanPham quanLySanPham = new QuanLySanPham();
        quanLySanPham.themSanPham(hcn1);
        quanLySanPham.themSanPham(ht1);
        quanLySanPham.themSanPham(ht2);
        quanLySanPham.themSanPham(ht3);
        quanLySanPham.themSanPham(hcn2);
        quanLySanPham.themSanPham(hcn3);

        ArrayList<SanPham> dsDaSapXep = quanLySanPham.sapXepTrongLuongTangDan();
        assertEquals(hcn2.getTrongLuong(), dsDaSapXep.get(0).getTrongLuong());
        assertEquals(ht2.getTrongLuong(), dsDaSapXep.get(1).getTrongLuong());
        assertEquals(ht1.getTrongLuong(), dsDaSapXep.get(2).getTrongLuong());
        assertEquals(hcn3.getTrongLuong(), dsDaSapXep.get(dsDaSapXep.size() - 1).getTrongLuong());
    }

    @Test
    public void testSapXepTheoLoaiSanPhamRoiTheoTrongLuong() {      //(1 diem)
        //SanPham.LOAI_SP_HINH_TRON = 1;
        //SanPham.LOAI_SP_HINH_CHU_NHAT = 2;
        
        SanPham hcn1 = new SanPhamHinhChuNhat(20, 50, 17.5);
        SanPham hcn2 = new SanPhamHinhChuNhat(90, 30, 6.5);
        SanPham hcn3 = new SanPhamHinhChuNhat(50, 8, 17.5);
        SanPham ht1 = new SanPhamHinhTron(5, 14.5);
        SanPham ht2 = new SanPhamHinhTron(9, 8.5);
        SanPham ht3 = new SanPhamHinhTron(16, 15.5);

        QuanLySanPham quanLySanPham = new QuanLySanPham();
        quanLySanPham.themSanPham(hcn1);
        quanLySanPham.themSanPham(ht1);
        quanLySanPham.themSanPham(ht2);
        quanLySanPham.themSanPham(ht3);
        quanLySanPham.themSanPham(hcn2);
        quanLySanPham.themSanPham(hcn3);

        ArrayList<SanPham> dsDaSapXep = quanLySanPham.sapXepTheoLoaiSanPhamRoiTheoTrongLuong();
        assertEquals(ht2.getTrongLuong(), dsDaSapXep.get(0).getTrongLuong());
        assertEquals(ht1.getTrongLuong(), dsDaSapXep.get(1).getTrongLuong());
        assertEquals(hcn2.getTrongLuong(), dsDaSapXep.get(3).getTrongLuong());
        assertEquals(hcn3.getTrongLuong(), dsDaSapXep.get(dsDaSapXep.size() - 1).getTrongLuong());
    }
}
