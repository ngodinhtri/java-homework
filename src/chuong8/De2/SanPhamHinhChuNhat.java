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
public class SanPhamHinhChuNhat extends SanPham{
    private int dai;
    private int cao;
    private double trongLuong;
    private final int loai = 2;

    public SanPhamHinhChuNhat(int dai, int cao, double trongLuong) {
        if( dai < 0 || cao < 0 || trongLuong < 0)
        {
            throw new IllegalArgumentException();
        }
        this.dai = dai;
        this.cao = cao;
        this.trongLuong = trongLuong;
    }

    @Override
    public int getLoai() {
        return loai;
    }
    
    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getCao() {
        return cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }
    

    @Override
    public double tinhDienTich() {
       return dai * cao;
    }

    @Override
    public String toString() {
        return "SanPhamHinhChuNhat("+ dai +", "+cao+", " +trongLuong+")";
    }
    
    
}
