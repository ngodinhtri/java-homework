/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngodi
 */
public class BT1 {

    public static void main(String[] args) {
        String path = "BT1.txt";
        String content = "Đây là đoạn văn mẫu BT1\nĐây là dòng 2.";
        
        writeText(path,content);
        String result = readText(path);
        System.out.println(result);
    }
    
    public static void writeText(String path,String content)
    {
        File f = new File(path);
        try {
            //Tạo luồng
            FileWriter fw = new FileWriter(f);
            //Ghi File
            fw.write(content);
            //Đóng
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String readText(String path) {
        String content = "";
        try {
            //Tạo liên kết và tạo luồng
            File f = new File(path);
            FileReader fr = new FileReader(f);
            //Đọc file
            BufferedReader br = new BufferedReader(fr);
            int i;
            while ((i = br.read()) != -1) {
                content+=(char)i;
            }
            //Đóng
            fr.close();
        }  catch (IOException ex) {
            ex.printStackTrace();
        }
        return content;
    }
}
