/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import javax.swing.JComponent;

/**
 *
 * @author ngodi
 */
public class RainbowComponent2D extends JComponent{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Arc2D red = new Arc2D.Double(100,300,800,800,0,180,Arc2D.OPEN);
        Arc2D orange = new Arc2D.Double(150,350,700,700,0,180,Arc2D.OPEN);
        Arc2D yellow = new Arc2D.Double(200,400,600,600,0,180,Arc2D.OPEN);
        Arc2D green = new Arc2D.Double(250,450,500,500,0,180,Arc2D.OPEN);
        Arc2D blue = new Arc2D.Double(300,500,400,400,0,180,Arc2D.OPEN);
        Arc2D darkblue = new Arc2D.Double(350,550,300,300,0,180,Arc2D.OPEN);
        Arc2D purple = new Arc2D.Double(400,600,200,200,0,180,Arc2D.OPEN);
        Arc2D white = new Arc2D.Double(450,650,100,100,0,180,Arc2D.OPEN);
        
        
        g2.draw(red);
        g2.setColor(Color.red);
        g2.fill(red);
        
        g2.draw(orange);
        g2.setColor(Color.orange);
        g2.fill(orange);
        
        g2.draw(yellow);
        g2.setColor(Color.yellow);
        g2.fill(yellow);
        
         g2.draw(green);
        g2.setColor(Color.green);
        g2.fill(green);
        
         g2.draw(blue);
        g2.setColor(Color.blue);
        g2.fill(blue);
        
         g2.draw(darkblue);
        g2.setColor(new Color(0, 0, 139));
        g2.fill(darkblue);
        
         g2.draw(purple);
        g2.setColor(new Color(128, 0, 128));
        g2.fill(purple);
        
         g2.draw(white);
        g2.setColor(Color.white);
        g2.fill(white);
    }
}
