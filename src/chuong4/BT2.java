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

/**
 *
 * @author ngodinhtri
 * @date 19-11-2020
 */
public class BT2 {

    public static void main(String[] args) {
        String path = "BT2.txt";
        //Tạo file data.txt chứa dãy số với số lượng không biết trước
        createDataTxt(path);
        //Trả về mảng
        double[] result = readDataTxt(path);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        //Sum of array
        double sum = 0.0;
        for (double item : result) {
            sum += item;
        }
        //Average of Array
        double average = sum / result.length;
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Length of Array: " + result.length);
        System.out.println("Sum of Array: " + sum);
        System.out.println("Average of Array: " + average);
    }

    public static void createDataTxt(String path) {
        File f = new File(path);

        Random rand = new Random();
        double[] arr = new double[(rand.nextInt(100) + 1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * (99) + 1;
        }
        try {
            FileWriter fw = new FileWriter(f);
            for (int i = 0; i < arr.length; i++) {
                if (i == (arr.length - 1)) {
                    fw.write(arr[i] + "");
                } else {
                    fw.write(arr[i] + " ");
                }
            }
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static double[] readDataTxt(String path) {
        String content = "";
        double[] arrResult = null;
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

            String[] arrTemp = content.split(" ");
            double[] arrNumber = new double[arrTemp.length];
            for (int i = 0; i < arrTemp.length; i++) {
                arrNumber[i] = Double.parseDouble(arrTemp[i]);
            }
            arrResult = arrNumber;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return arrResult;
    }
}
