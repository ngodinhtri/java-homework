/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7.InvoiceManagenment;

/**
 *
 * @author ngodi
 */
public class Demo {
    public static void main(String[] args) {
        Customer ctm1 = new Customer("Ngo Dinh Tri", "0123456789", "Quan Thu Duc, Thanh Pho HCM");
        Invoice inv1 = new Invoice(ctm1);
        
        //Products
        Product prod1 = new Product("pen 11T", 3000);
        Product prod2 = new Product("T - Shirt", 10000);
        Product prod3 = new Product("Hat Sun", 6000);
        
        inv1.add(prod1, 6);
        inv1.add(prod2, 2);
        inv1.add(prod3, 5);
        
        System.out.println(inv1.format());
    }
}
