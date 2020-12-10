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
public class BT4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setTitle("Graphics 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RainbowComponent2D rainbow = new RainbowComponent2D();
        frame.add(rainbow);

        frame.setVisible(true);
    }
}
