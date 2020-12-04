/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

/**
 *
 * @author ngodinhtri
 * @date 4-11-2020
 */
public class PhanSo {
    //Attributes

    private int tuSo;
    private int mauSo;

    //Contructors
    public PhanSo(int tuSo) {
        this.tuSo = tuSo;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    //Getters & Setters

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    //toString

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }

    //Methods
    public PhanSo toiGian() {
        int ucln = timUCLN(tuSo, mauSo);

        if (tuSo / ucln == tuSo) {
            return new PhanSo(tuSo, mauSo);
        }
        return new PhanSo(tuSo / ucln, mauSo / ucln);
    }
    
    public PhanSo congPhanSo(PhanSo ps)
    {
        int ts = this.tuSo * ps.getMauSo() + ps.getTuSo() * this.mauSo;
        int ms = this.mauSo * ps.getMauSo();
        
        PhanSo newPS = new PhanSo(ts, ms);
        return newPS.toiGian();
    }
    
    public PhanSo truPhanSo(PhanSo ps)
    {
        int ts = Math.abs(this.tuSo * ps.getMauSo() - ps.getTuSo() * this.mauSo);
        int ms = this.mauSo * ps.getMauSo();
        
        PhanSo newPS = new PhanSo(ts, ms);
        newPS = newPS.toiGian();
        if((this.tuSo * ps.getMauSo() - ps.getTuSo() * this.mauSo)<0)
        {
            newPS.setTuSo(newPS.getTuSo()*-1);
        }
        
        return newPS;
    }
    
    public PhanSo nhanPhanSo(PhanSo ps)
    {
        int ts = this.tuSo * ps.getTuSo();
        int ms = this.mauSo * ps.getMauSo();
        
        PhanSo newPS = new PhanSo(ts, ms);
        return newPS.toiGian();        
    }
    
    public PhanSo chiaPhanSo(PhanSo ps)
    {
        int ts = this.tuSo * ps.getMauSo();
        int ms = this.mauSo * ps.getTuSo();
        
        PhanSo newPS = new PhanSo(ts, ms);
        return newPS.toiGian();        
    }


    //UCLN
    private int timUCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}