/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7;

import java.util.Comparator;

/**
 *
 * @author ngodi
 */
public class NameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        SinhVien sv1 = (SinhVien) o1;
        SinhVien sv2 = (SinhVien) o2;
        
        return sv1.getTen().compareTo(sv2.getTen());
    }
}