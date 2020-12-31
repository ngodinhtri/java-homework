/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong8.BTTongHop;

import java.util.Comparator;

/**
 *
 * @author ngodi
 */
public class SortShapes implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        MyShape ms1 = (MyShape) o1;
        MyShape ms2 = (MyShape) o2;
        
        if(ms1.calculateArea() == ms2.calculatePerimeter())
        {
            return 0;
        }
        else if(ms1.calculateArea() > ms2.calculateArea())
        {
            return 1;
        }
        else if(ms1.calculateArea() < ms2.calculateArea())
        {
            return -1;
        }
        return 0;
    }
    
}
