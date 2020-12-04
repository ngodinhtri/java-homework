/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuong4;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class SinhVien implements Serializable{
    private String MSSV;
    private String hoTen;
    private int namSinh;
    private double diem;

    public SinhVien(String MSSV, String hoTen, int namSinh, double diem) {
        this.MSSV = MSSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return  MSSV + "-" + hoTen + "-" + namSinh + "-" + diem;
    }
    
    
}
