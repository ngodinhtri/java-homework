/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ReadWriteText {

    public static void writeText(String path, String content) {
        try {
            //tạo link file và tạo luồng
            File f = new File(path);
            FileWriter fw = new FileWriter(f);

            //Ghi file
            fw.write(content);

            //Đóng
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) {
        String content = "";
        try {
            File f = new File(path);
            FileReader fr = new FileReader(f);

            //Đọc file
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                content += line;
            }
            //Đóng 
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    public static void writeStudent(String path, ArrayList<SinhVien> alSV) {
        try {
            //tạo link file và tạo luồng
            File f = new File(path);
            FileWriter fw = new FileWriter(f);

            //Ghi file
            int idx = 0;
            for (SinhVien item : alSV) {
                if (idx == alSV.size() - 1) {
                    fw.write(item.toString());
                } else {
                    fw.write(item.toString() + "\r\n");
                }
                idx++;
            }

            //Đóng
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<SinhVien> readStudent(String path) {
        ArrayList<SinhVien> KQ = new ArrayList<>();
        try {
            //Tạo liên kết & luồng
            File f = new File(path);
            FileReader fr = new FileReader(f);
            
            //Đọc File
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine())!=null)
            {
                String[] info = line.split("-");
                String MSSV = info[0];
                String hoTen = info[1];
                int namSinh = Integer.parseInt(info[2]);
                double diem = Double.parseDouble(info[3]);
                SinhVien sv = new SinhVien(MSSV, hoTen, namSinh, diem);
                KQ.add(sv);
            }
            //Đóng
            fr.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return KQ;
    }
}
