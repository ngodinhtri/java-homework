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
public class XepLaBaiTheoLoai implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        LaBai lb1 = (LaBai) o1;
        LaBai lb2 = (LaBai) o2;
        
        if(lb1.getLoai()== lb2.getLoai())
        {
            if(lb1.getThuTu()== lb2.getThuTu())
            {
                return 0;
            }
            else if(lb1.getThuTu() > lb2.getThuTu())
            {
                return 1;
            }
            else if(lb1.getThuTu() < lb2.getThuTu())
            {
                return -1;
            }
        }
        else if(lb1.getLoai() > lb2.getLoai())
        {
            return 1;
        }
        else if(lb1.getLoai() < lb2.getLoai())
        {
            return -1;
        }
        return 0;
    }
 
}
