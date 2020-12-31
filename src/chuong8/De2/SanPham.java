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
public abstract class SanPham {
    protected double trongLuong;
    public static final int LOAI_SP_HINH_TRON = 1;
    public static final int LOAI_SP_HINH_CHU_NHAT = 2;

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }
    
    
    public abstract double tinhDienTich();
    @Override
    public abstract String toString();
    public abstract int getLoai();
}
