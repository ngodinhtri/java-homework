/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import javax.swing.JFrame;


/**
 *
 * @author ngodi
 */
public class DemoGraphics2D {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setTitle("Graphics 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        RectangleComponent rectangleComponent = new RectangleComponent();
//        frame.add(rectangleComponent);
        
//        TruckComponent2D truck = new TruckComponent2D();
//        frame.add(truck);

           RainbowComponent2D rainbow =new RainbowComponent2D();
           frame.add(rainbow);  
           
        frame.setVisible(true);
    }
}
