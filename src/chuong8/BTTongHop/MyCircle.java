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
public class MyCircle extends MyShape {

    private int radius;

    public MyCircle(int radius, MyPoint startPoint) {
        super(startPoint);
        this.radius = radius;
    }

    public MyCircle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String show() {
        return "Circle( x: " + this.startPoint.getX() + ", y: " + this.startPoint.getY() + ", r: " + radius + " ) - Area: "+calculateArea();
    }
}
