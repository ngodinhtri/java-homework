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
public class MyRectangle extends MyShape {

    private int width;
    private int height;

    public MyRectangle(int width, int height, MyPoint startPoint) {
        super(startPoint);
        this.width = width;
        this.height = height;
    }

    public MyRectangle(int width, int height, int x, int y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String show() {
        return "Rectangle( x: "+ this.startPoint.getX() + ", y: "+this.startPoint.getY() + ", w: "+ width + ", h: "+height+ " ) - Area: "+calculateArea();
    }

}
