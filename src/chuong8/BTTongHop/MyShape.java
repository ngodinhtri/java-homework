/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong8.BTTongHop;

/**
 *
 * @author ngodi
 */
public abstract class MyShape {
    protected MyPoint startPoint;

    public MyShape(MyPoint startPoint) {
        this.startPoint = startPoint;
    }

    public MyShape(int x, int y) {
        startPoint = new MyPoint(x, y);
    }
    
    
    
    public abstract double calculateArea();
        
    public abstract double calculatePerimeter();
    
    public abstract String show();
}
