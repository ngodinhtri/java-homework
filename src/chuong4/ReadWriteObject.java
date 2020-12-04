/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuong4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ReadWriteObject {
    public static void WirteStudent(String path)
    {
        try {
            FileOutputStream fos = new FileOutputStream(path);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
