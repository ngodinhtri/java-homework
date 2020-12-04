/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

/**
 *
 * @author ngodi
 */
public class SinhVien {
    private String hoTen;
    private String maSV;
    private String email;
    private String sdt;

    public SinhVien(String hoTen, String maSV, String email, String sdt) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.email = email;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    @Override
    public String toString() {
        return "SinhVien " +"{ "+ "Ten: " + hoTen + " - Ma SV: " + maSV + " - Email: " + email + " - SDT: " + sdt+" }";
    }
}
