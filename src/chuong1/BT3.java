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
public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        
        System.out.print("Enter your name: ");
        name  = input.nextLine();
        
        System.out.printf("Welcome %s to Java World!",name);
    }
}
