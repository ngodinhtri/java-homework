/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestChuong8BTTH;


import chuong8.BTTongHop.*;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ngodi
 */
public class UnitTestShape {
    
    //Test countRectangle
    @Test
    public void testCountRectangle()
    {
         //Tạo các hình chữ nhật
        MyRectangle r1 = new MyRectangle(2, 3, 1, 1);
        MyRectangle r2 = new MyRectangle(5, 3, 0, -1);
        MyRectangle r3 = new MyRectangle(7, 4, -1, 3);
        MyRectangle r4 = new MyRectangle(1, 3, 3, 2);
        MyRectangle r5 = new MyRectangle(2, 2, 2, 2);
        MyRectangle r6 = new MyRectangle(3, 6, -2, -1);
        MyRectangle r7 = new MyRectangle(5, 4, 3, 0);
        MyRectangle r8 = new MyRectangle(3, 1, 4, 1);
        MyRectangle r9 = new MyRectangle(4, 7, -2, 2);
        MyRectangle r10 = new MyRectangle(4, 5, 3, 1);
        //Tạo các hình tròn
        MyCircle c1 = new MyCircle(3, -1, 0);
        MyCircle c2 = new MyCircle(4, 0, 1);
        MyCircle c3 = new MyCircle(3, 1, 2);
        MyCircle c4 = new MyCircle(2, 2, 3);
        MyCircle c5 = new MyCircle(1, -1, 1);
        //Tạo danh sách quản lý hình
        ShapesManager shapes = new ShapesManager();

        shapes.add(r1);
        shapes.add(r2);
        shapes.add(r3);
        shapes.add(r4);
        shapes.add(r5);
        shapes.add(r6);
        shapes.add(r7);
        shapes.add(r8);
        shapes.add(r9);
        shapes.add(r10);
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(c3);
        shapes.add(c4);
        shapes.add(c5);
        
        int expected = 10;
        int actual = shapes.countRectangles();
        
        Assert.assertEquals(actual, expected);
    }
    
    //Test countCircle
    @Test
    public void testCountCircle()
    {
         //Tạo các hình chữ nhật
        MyRectangle r1 = new MyRectangle(2, 3, 1, 1);
        MyRectangle r2 = new MyRectangle(5, 3, 0, -1);
        MyRectangle r3 = new MyRectangle(7, 4, -1, 3);
        MyRectangle r4 = new MyRectangle(1, 3, 3, 2);
        MyRectangle r5 = new MyRectangle(2, 2, 2, 2);
        MyRectangle r6 = new MyRectangle(3, 6, -2, -1);
        MyRectangle r7 = new MyRectangle(5, 4, 3, 0);
        MyRectangle r8 = new MyRectangle(3, 1, 4, 1);
        MyRectangle r9 = new MyRectangle(4, 7, -2, 2);
        MyRectangle r10 = new MyRectangle(4, 5, 3, 1);
        //Tạo các hình tròn
        MyCircle c1 = new MyCircle(3, -1, 0);
        MyCircle c2 = new MyCircle(4, 0, 1);
        MyCircle c3 = new MyCircle(3, 1, 2);
        MyCircle c4 = new MyCircle(2, 2, 3);
        MyCircle c5 = new MyCircle(1, -1, 1);
        //Tạo danh sách quản lý hình
        ShapesManager shapes = new ShapesManager();

        shapes.add(r1);
        shapes.add(r2);
        shapes.add(r3);
        shapes.add(r4);
        shapes.add(r5);
        shapes.add(r6);
        shapes.add(r7);
        shapes.add(r8);
        shapes.add(r9);
        shapes.add(r10);
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(c3);
        shapes.add(c4);
        shapes.add(c5);
        
        int expected = 5;
        int actual = shapes.countCircles();
        
        Assert.assertEquals(actual, expected);
    }
    
}
