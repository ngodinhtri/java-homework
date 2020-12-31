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
public class LineItem {
    private int quantity;
    private Product product;

    public LineItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double getAmount(){
        return product.getPrice() * quantity;
    }

    public String format() {
        return String.format("%-30s%,12.0f%5d%,12.0f", product.getDescription(), product.getPrice(), quantity, getAmount());
    }
    
    
}
