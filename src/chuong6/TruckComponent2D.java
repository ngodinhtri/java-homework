/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author ngodi
 */
public class TruckComponent2D extends JComponent{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(300,500,400,100);
        g2.draw(box);
        g2.setColor(Color.ORANGE);
        g2.fill(box);
        
        Line2D line1 = new Line2D.Double(700,500,700,400);
        Line2D line2 = new Line2D.Double(700,400,800,400);
        Line2D line3 = new Line2D.Double(800,400,900,500);
        Line2D line4 = new Line2D.Double(900,500,900,600);
        Line2D line5 = new Line2D.Double(900,600,700,600);
        
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);
        g2.draw(line5);
        
        Ellipse2D circle1 = new Ellipse2D.Double(400,600,100,100);
        Ellipse2D circle2 = new Ellipse2D.Double(700,600,100,100);
        
        g2.draw(circle1);
        g2.draw(circle2);
        g2.fill(circle1);
        g2.fill(circle2);
        
    }
}
