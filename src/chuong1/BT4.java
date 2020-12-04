/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author ngodinhtri
 * @date 16-10-2020
 */
public class BT4 {

    public static int enterInteger() {
        Scanner input = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        
        while(!check)
        {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Please enter integer. Try again!");
                input.nextLine();
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int width, height = 0;
        
        System.out.print("Enter width: ");
        width = enterInteger();
         System.out.print("Enter height: ");
        height = enterInteger();
        
        System.out.printf("Area of Rectangle(%d, %d) is %d\t", width, height, (width + height)*2);
        System.out.printf("Premiter of Rectangle(%d, %d) is %d", width, height, width * height);
    }
}
