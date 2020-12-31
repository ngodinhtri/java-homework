/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7.InvoiceManagenment;

import java.util.ArrayList;

/**
 *
 * @author ngodi
 */
public class Invoice {
    private Customer customer;
    private ArrayList<LineItem> items;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<LineItem>();
    }
    
    public void add(Product product, int quantity)
    {
        items.add(new LineItem(quantity, product));
    }
    
    public double getTotal()
    {
        double r = 0.0;
        for(LineItem li : items)
        {
            r+=li.getAmount();
        }
        return r;
    }
    
    public String format()
    {
        String s =   "\n\t\t\tI N V O I C E\n\n"
                +customer.format()
                +"\n\n------------------------------------------------------------"
                +String.format("\n%-30s%12s%5s%12s\n","Description", "Price", "Qty", "Amount");
        for(LineItem li : items)
        {
            s+= li.format()+"\n";
        }
        
        s+="\n\n------------------------------------------------------------";
        s+= String.format("\nTotal: %,8.0f VND",getTotal());
        return s;
    }
}
