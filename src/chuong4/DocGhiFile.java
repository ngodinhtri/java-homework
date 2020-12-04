/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuong4;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DocGhiFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //Copy hình
//        String pathIn = "D:\\Koala.jpg";
//        String pathOut = "D:\\HinhCopy.jpg";
//        String pathText = "D:\\Test.txt";
//        
//        ReadWriteBinaryData.writeBinaryData("D:\\Test.bin");
//        ReadWriteBinaryData.readBinaryData("D:\\Test.bin");
//        ReadWriteBinaryData.copyFile(pathIn,pathOut);
        
//        String content = "Đây là dòng 1 \nĐây là dòng 2"; 
//        ReadWriteText.writeText(pathText, content);
//        String result = ReadWriteText.readFile(pathText);
//        System.out.println(result);
      
        
        //Đọc ghi file sinh viên
        SinhVien sv1 = new SinhVien("MSSV1", "Sinh Vien 1", 2000, 9.5);
        SinhVien sv2 = new SinhVien("MSSV2", "Sinh Vien 2", 2001, 8.5);
        SinhVien sv3 = new SinhVien("MSSV3", "Sinh Vien 3", 2002, 7.5);
        
        ArrayList<SinhVien> alSV = new ArrayList<>();
        ArrayList<SinhVien> KQ = new ArrayList<>();
        alSV.add(sv1);
        alSV.add(sv2);
        alSV.add(sv3);
        
        String pathSV = "D:\\SinhVien.txt";
        
        ReadWriteText.writeStudent(pathSV, alSV);
        KQ = ReadWriteText.readStudent(pathSV);
        
        System.out.println(KQ);
    }
    
}
