/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong8.BTTongHop;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ngodi
 */
public class ShapesManager {

    private ArrayList<MyShape> shapes;

    public ShapesManager(ArrayList<MyShape> shapes) {
        this.shapes = shapes;
    }

    public ShapesManager() {
        shapes = new ArrayList<MyShape>();
    }

    public void add(MyShape shape) {
        shapes.add(shape);
    }

    public int countRectangles() {
        int count = 0;
        for (MyShape item : shapes) {
            if (item instanceof MyRectangle) {
                count++;
            }
        }
        return count;
    }

    public int countCircles() {
        int count = 0;
        for (MyShape item : shapes) {
            if (item instanceof MyCircle) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<MyRectangle> getMaxRectangles() {
        ArrayList<MyRectangle> arrMaxRec = new ArrayList<MyRectangle>();
        ArrayList<MyRectangle> arrRec = new ArrayList<MyRectangle>();

        for (MyShape item : shapes) {
            if (item instanceof MyRectangle) {
                arrRec.add((MyRectangle) item);
            }
        }

        Collections.sort(arrRec, new SortShapes());

        double maxArea = arrRec.get(arrRec.size() - 1).calculateArea();

        for (MyRectangle item : arrRec) {
            if (item.calculateArea() == maxArea) {
                arrMaxRec.add(item);
            }
        }

        return arrMaxRec;
    }

    public void show() {
        for (MyShape item : shapes) {

            System.out.println(item.show());

        }
    }

    public void showRectangles() {
        for (MyShape item : shapes) {
            if (item instanceof MyRectangle) {
                System.out.println(item.show());
            }
        }
    }
    
    public void showCircle() {
        for (MyShape item : shapes) {
            if (item instanceof MyCircle) {
                System.out.println(item.show());
            }
        }
    }
    
    public void sortShapes()
    {
        Collections.sort(shapes, new SortShapes());
    }
    
    public void shuffleShapes(){
        Collections.shuffle(shapes);
    }
}
