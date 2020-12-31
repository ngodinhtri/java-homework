/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong8.De2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ngodi
 */
public class QuanLySanPham {

    private ArrayList<SanPham> dssp;

    public QuanLySanPham(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    public QuanLySanPham() {
        dssp = new ArrayList<SanPham>();
    }

    public double tinhTongDienTichSanPhamHinhChuNhat() {
        double result = 0;
        for (SanPham item : dssp) {
            if (item instanceof SanPhamHinhChuNhat) {
                result += ((SanPhamHinhChuNhat) item).tinhDienTich();
            }
        }
        return result;
    }

    public void themSanPham(SanPham sp) {
        dssp.add(sp);
    }

    public ArrayList<SanPham> layDsSanPhamCoTrongLuongMax() {
        ArrayList<SanPham> arrMaxSP = new ArrayList<SanPham>();
        ArrayList<SanPham> arrSP = dssp;

        Collections.sort(arrSP, new SapXepSanPhamTheoTrongLuong());

        double max = arrSP.get(arrSP.size() - 1).getTrongLuong();

        for (SanPham item : dssp) {
            if (item.getTrongLuong() == max) {
                arrMaxSP.add(item);
            }
        }

        return arrMaxSP;
    }

    public double tinhTongTrongLuongTheoLoai(int Loai) {
        double result = 0;
        if (Loai == SanPham.LOAI_SP_HINH_CHU_NHAT) {
            for (SanPham item : dssp) {
                if (item instanceof SanPhamHinhChuNhat) {
                    result += ((SanPhamHinhChuNhat) item).getTrongLuong();
                }
            }
        }
        else if(Loai == SanPham.LOAI_SP_HINH_TRON)
        {
            for (SanPham item : dssp) {
                if (item instanceof SanPhamHinhTron) {
                    result += ((SanPhamHinhTron) item).getTrongLuong();
                }
            }
        }
        return result;
    }
    
    public ArrayList<SanPham> sapXepTrongLuongTangDan()
    {
        ArrayList<SanPham> arrSP = dssp;
        Collections.sort(arrSP, new SapXepSanPhamTheoTrongLuong());
        return arrSP;
    }
    
    public ArrayList<SanPham> sapXepTheoLoaiSanPhamRoiTheoTrongLuong()
    {
        ArrayList<SanPham> arrSP = dssp;
        Collections.sort(arrSP, new SapXepTheoLoaiSanPhamRoiTheoTrongLuong());
        return arrSP;
    }
}
