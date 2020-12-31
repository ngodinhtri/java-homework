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
public class SinhVien implements Comparable<SinhVien>{
    private int id;
    private String ten;
    private int tuoi;

    public SinhVien(int id, String ten, int tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", ten=" + ten + ", tuoi=" + tuoi + '}';
    }
    
    public int compareTo(SinhVien sv)
    {
        if(tuoi == sv.tuoi)
            return 0;
        else if(tuoi > sv.tuoi)
            return -1;
        else if(tuoi < sv.tuoi)
            return 1;
        return 0;
    }
}
