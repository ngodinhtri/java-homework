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
public class Diem {
    private int x;
    private int y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", "+ y + ')';
    }
    
    
    
    public double tinhKhoangCachToiGocToaDo()
    {
        return (double) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    
    public double tinhKhoangCach2Diem(Diem diem2)
    {
        return (double) Math.sqrt(Math.pow(Math.abs(x- diem2.getX()), 2) + Math.pow(Math.abs(y- diem2.getY()), 2));
    }
}
