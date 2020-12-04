/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ngodi
 */
public class DemoJFrame {

    public static void main(String[] args) {
        //Frames
        JFrame frame = new JFrame();
        frame.setSize(1200, 720);
        frame.setTitle("Demo Jframe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panels
        JPanel panelNorth = new JPanel();
        JPanel panelSouth = new JPanel();
        JPanel panelWest = new JPanel();
        JPanel panelEast = new JPanel();
        JPanel panelCenter = new JPanel();

        //Components
        JLabel lb_N_hoTen = new JLabel("Họ và tên: ");
        JTextField txt_N_hoTen = new JTextField(50);
        JButton btn_N_chao = new JButton("Enter");
        JLabel lb_N_loiChao = new JLabel();

        // Thêm các panel vào frame
        frame.add(panelNorth);

        //Thêm các components vào panel
        panelNorth.add(lb_N_hoTen);
        panelNorth.add(txt_N_hoTen);
        panelNorth.add(btn_N_chao);
        panelNorth.add(lb_N_loiChao);

        //Tùy chỉnh panel
        panelNorth.setBackground(Color.CYAN);
        
        
        //Thêm sự kiện
        btn_N_chao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lb_N_loiChao.setText(" Xin Chào " + txt_N_hoTen.getText());
                    
            }
        });

        frame.setVisible(true);
    }
}
