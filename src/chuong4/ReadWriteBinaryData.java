/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuong4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ReadWriteBinaryData {
    public static void writeBinaryData(String path)
    {
        try {
            //Tao lien ket & luong
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            
            //Ghi Data\
            dos.writeInt(999);
            dos.writeFloat((float) 9.9);
            
            //Dong
            dos.close();
            fos.close();
                    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     
    public static void readBinaryData(String path){
        try {
            FileInputStream  fis = new FileInputStream(path);
            DataInputStream dis =new DataInputStream(fis);
            
            int i =  dis.readInt();
            float f = dis.readFloat();
            
            dis.close();
            fis.close();
            
            System.out.println(i);
            System.out.println(f);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void copyFile(String pathIn, String pathOut)
    {
        try {
            FileInputStream fis = new FileInputStream(pathIn);
            FileOutputStream fos = new FileOutputStream(pathOut);
            
            int c = 0;
            while((c = fis.read())!=-1)
            {
                fos.write(c);
            }
            
            fos.close();
            fis.close();
                    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
