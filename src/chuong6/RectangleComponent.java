/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author ngodi
 */
public class RectangleComponent extends JComponent{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle box = new Rectangle(50,30,300,150);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.red);
        g2.draw(box);
        g2.setColor(Color.CYAN);
        g2.fill(box);
        
    }
}
