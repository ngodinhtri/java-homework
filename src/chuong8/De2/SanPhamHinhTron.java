/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong8.De2;

/**
 *
 * @author ngodi
 */
public class SanPhamHinhTron extends SanPham {

    private int banKinh;
    private double trongLuong;
    private final int loai = 1;

    public SanPhamHinhTron(int banKinh, double trongLuong) {
        if (banKinh < 0 || trongLuong < 0) {
            throw new IllegalArgumentException();
        }
        this.banKinh = banKinh;
        this.trongLuong = trongLuong;
    }

    @Override
    public int getLoai() {
        return loai;
    }
    
    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    @Override
    public double tinhDienTich() {
        return banKinh * banKinh * 3.14;
    }

    @Override
    public String toString() {
        return "SanPhamHinhTron(" + banKinh + ", " + trongLuong + ")";
    }
}
