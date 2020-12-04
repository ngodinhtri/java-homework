/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPhanSo;

import chuong2.PhanSo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ngodi
 */
public class PhanSoTest {

    @Test
    public void testToString()
    {
        PhanSo ps = new PhanSo(2, 5);
        String actual = ps.toString();
        String expected = "2/5";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToiGian()
    {
        PhanSo ps = new PhanSo(3, 9);
        String actual = ps.toiGian().toString();
        String expected = new PhanSo(1,3).toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCongPS()
    {
        PhanSo ps0 = new PhanSo(3, 2);
        PhanSo ps1 = new PhanSo(1, 4);
        String actual = ps0.congPhanSo(ps1).toString();
        String expected = new PhanSo(7,4).toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTruPS()
    {
        PhanSo ps0 = new PhanSo(3, 2);
        PhanSo ps1 = new PhanSo(1, 4);
        String actual = ps0.truPhanSo(ps1).toString();
        String expected = new PhanSo(5,4).toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNhanPS()
    {
        PhanSo ps0 = new PhanSo(3, 2);
        PhanSo ps1 = new PhanSo(1, 4);
        String actual = ps0.nhanPhanSo(ps1).toString();
        String expected = new PhanSo(3,8).toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testChiaPS()
    {
        PhanSo ps0 = new PhanSo(3, 2);
        PhanSo ps1 = new PhanSo(5, 4);
        String actual = ps0.chiaPhanSo(ps1).toString();
        String expected = new PhanSo(6,5).toString();
        assertEquals(expected, actual);
    }
}
