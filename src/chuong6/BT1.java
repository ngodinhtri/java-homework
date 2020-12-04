/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ngodi
 */
public class BT1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250, 200);
        frame.setTitle("BT1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel_Center = new JPanel();

        JLabel lb_nhapNum1 = new JLabel("Nhập số thứ nhất: ");
        JLabel lb_nhapNum2 = new JLabel("Nhập số thứ hai: ");
        JLabel lb_ketQua = new JLabel("Kết quả: ");
        JTextField txt_num1 = new JTextField(10);
        JTextField txt_num2 = new JTextField(10);
        JButton btn_Cong = new JButton("Cộng");
        JButton btn_Tru = new JButton("Trừ");
        JButton btn_Nhan = new JButton("Nhân");

        panel_Center.add(lb_nhapNum1);
        panel_Center.add(txt_num1);
        panel_Center.add(lb_nhapNum2);
        panel_Center.add(txt_num2);
        panel_Center.add(btn_Cong);
        panel_Center.add(btn_Tru);
        panel_Center.add(btn_Nhan);
        panel_Center.add(lb_ketQua);

        frame.add(panel_Center);

        btn_Cong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kq = Integer.parseInt(txt_num1.getText()) + Integer.parseInt(txt_num2.getText());
                lb_ketQua.setText("Kết quả: " + kq);
            }
        });
        btn_Tru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kq = Integer.parseInt(txt_num1.getText()) - Integer.parseInt(txt_num2.getText());
                 lb_ketQua.setText("Kết quả: " + kq);
            }
        });
        btn_Nhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int kq = Integer.parseInt(txt_num1.getText()) * Integer.parseInt(txt_num2.getText());
                 lb_ketQua.setText("Kết quả: " + kq);
            }
        });

        frame.setVisible(true);
    }
}
