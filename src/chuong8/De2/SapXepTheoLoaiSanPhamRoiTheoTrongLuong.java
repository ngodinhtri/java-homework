/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong8.De2;

import java.util.Comparator;

/**
 *
 * @author ngodi
 */
public class SapXepTheoLoaiSanPhamRoiTheoTrongLuong implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        SanPham sp1 = (SanPham) o1;
        SanPham sp2 = (SanPham) o2;

        if (sp1.getLoai() == sp2.getLoai()) {
            if (sp1.getTrongLuong() == sp2.getTrongLuong()) {
                return 0;
            } else if (sp1.getTrongLuong() > sp2.getTrongLuong()) {
                return 1;
            } else if (sp1.getTrongLuong() < sp2.getTrongLuong()) {
                return -1;
            }
        } else if (sp1.getLoai() > sp2.getLoai()) {
            return 1;
        } else if (sp1.getLoai() < sp2.getLoai()) {
            return -1;
        }
        return 0;
    }

}
