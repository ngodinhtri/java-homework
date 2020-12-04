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
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngodi
 */
public class BT3 {

    public static void main(String[] args) {
        String path = "BT3.txt";

        createNumberText(path);
        String result = readNumberText(path);
        System.out.println(result);
    }

    public static void createNumberText(String path) {
        File f = new File(path);
        if (f.exists()) {
            System.out.println("File existed");
        } //Nếu file chưa được tạo.
        else {
            System.out.println("File is not created.");
            Random rand = new Random();
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100) + 1;
            }
            Arrays.sort(arr);
            try {
                FileWriter fw = new FileWriter(f);
                for (int i = 0; i < arr.length; i++) {
                    if (i == (arr.length - 1)) {
                        fw.write(arr[i]+"");
                    } else {
                        fw.write(arr[i] + " ");
                    }
                }
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static String readNumberText(String path) {
        String content = "";
        try {
            //Tạo liên kết và tạo luồng
            File f = new File(path);
            FileReader fr = new FileReader(f);
            //Đọc file
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                content += line;
            }
            //Đóng
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return content;
    }
}
