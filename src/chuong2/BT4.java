/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.lang.reflect.Array;

/**
 *
 * @author ngodinhtri
 * @date 28-10-2020
 */
public class BT4 {

    public static void main(String[] args) {    
        System.out.println(covertDectoHex(500));
        
        System.out.print("DEC\t\tBIN\t\tOCT\t\tHEX\n");
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%d\t\t%s\t\t%s\t\t%s\n", i, covertDectoBin(i),covertDectoOctal(i),covertDectoHex(i));
        }
    }

    public static String covertDectoBin(int num) {
        int[] arrKQ = new int[0];
        int phanNguyen;
        int phanDu;
        String s = "";

       while (num!=0){
            phanNguyen = num / 2;
            phanDu = num % 2;
            num = phanNguyen;
            arrKQ = themPhanTu(arrKQ, phanDu);         
        } 

        for (int i = arrKQ.length - 1; i >= 0; i--) {
            s += arrKQ[i];
        }

        return s;
    }
    
    public static String covertDectoOctal(int num) {
        int[] arrKQ = new int[0];
        int phanNguyen;
        int phanDu;
        String s = "";

       while (num!=0){
            phanNguyen = num / 8;
            phanDu = num % 8;
            num = phanNguyen;
            arrKQ = themPhanTu(arrKQ, phanDu);         
        } 

        for (int i = arrKQ.length - 1; i >= 0; i--) {
            s += arrKQ[i];
        }

        return s;
    }
    
    public static String covertDectoHex(int num) {
        String[] arrHex = {"1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        int phanNguyen;
        int phanDu;
        String s = "";

       while (num!=0){
            phanNguyen = num / 16;
            phanDu = num % 16;
            num = phanNguyen;
            
            if(phanDu==0)
            {
                s+=0;
            }
            else{
                s = s.concat(arrHex[phanDu-1]);
            }
        } 
        s = new StringBuilder(s).reverse().toString();
        return s;
    }

    public static int[] themPhanTu(int[] arr, int e) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = e;

        return newArr;
    }
}
