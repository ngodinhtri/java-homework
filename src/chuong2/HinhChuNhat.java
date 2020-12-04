/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

/**
 *
 * @author ngodi
 */
public class HinhChuNhat {

    private Diem diemGocTraiTren;
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat(Diem diemGocTraiTren, int chieuDai, int chieuRong) {
        this.diemGocTraiTren = diemGocTraiTren;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public Diem getDiemGocTraiTren() {
        return diemGocTraiTren;
    }

    public void setDiemGocTraiTren(Diem diemGocTraiTren) {
        this.diemGocTraiTren = diemGocTraiTren;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public boolean thuocHinhChuNhat(Diem diem) {
        if (diemGocTraiTren.getX() <= diem.getX() && diemGocTraiTren.getX() + chieuDai >= diem.getX()) {
            if (diemGocTraiTren.getY() >= diem.getY() && diemGocTraiTren.getY() - chieuRong <= diem.getY()) {
                return true;
            }
        }

        return false;
    }

    public int tinhDienTichGiaoNhau2HinhChuNhat(HinhChuNhat hcn2) {
        if (!giaoNhau(hcn2)) {
            return 0;
        }

        int x1 = this.diemGocTraiTren.getX();
        int y1 = this.diemGocTraiTren.getY();

        int x2 = hcn2.diemGocTraiTren.getX();
        int y2 = hcn2.diemGocTraiTren.getY();

        int x1d1 = x1 + this.chieuDai;
        int x2d2 = x2 + hcn2.chieuDai;

        int y1r1 = y1 - this.chieuRong;
        int y2r2 = y2 - hcn2.chieuRong;
        
        int chieuDai = Math.min(x1d1, x2d2) - Math.max(x1, x2);
        int chieuRong =  Math.min(y1, y2) - Math.max(y1r1, y2r2);
        
        return chieuDai*chieuRong;
    }

    public boolean giaoNhau(HinhChuNhat hcn2) {
        if ((hcn2.diemGocTraiTren.getX() + hcn2.chieuDai) < this.diemGocTraiTren.getX()) {
            return false;
        }
        if (hcn2.diemGocTraiTren.getX() > (this.diemGocTraiTren.getX() + this.chieuDai)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "diemGocTraiTren = " + diemGocTraiTren + ", chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + '}';
    }

}
