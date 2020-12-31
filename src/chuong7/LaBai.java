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
public class LaBai {

    private int Loai;
    private int ThuTu;

    public LaBai(int Loai, int ThuTu) {
        this.Loai = Loai;
        this.ThuTu = ThuTu;
    }

    public int getLoai() {
        return Loai;
    }

    public void setLoai(int Loai) {
        this.Loai = Loai;
    }

    public int getThuTu() {
        return ThuTu;
    }

    public void setThuTu(int ThuTu) {
        this.ThuTu = ThuTu;
    }

    @Override
    public String toString() {
        String sLoai = "";
        String sThuTu = String.valueOf(ThuTu);

        switch (Loai) {
            case 1:
                sLoai = "Bích";
                break;
            case 2:
                sLoai = "Chuồn";
                break;
            case 3:
                sLoai = "Rô";
                break;
            case 4:
                sLoai = "Cơ";
                break;
        }

        switch (ThuTu) {
            case 11:
                sThuTu = "J";
                break;
            case 12:
                sThuTu = "Q";
                break;
            case 13:
                sThuTu = "K";
                break;
            case 14:
                sThuTu = "A";
                break;
        }
        return "[" + sThuTu + " " + sLoai + "]";
    }

}
