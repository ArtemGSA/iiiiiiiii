package org.skypro.skyshop.defineclass;

import org.skypro.skyshop.pubclass.Product;

public class SimpleProduct extends Product {
    private int price;
    public SimpleProduct(String name, int price){
        super (name);
        this.price = price;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getName()+": "+ price;
    }
    @Override
    public boolean isSpecial(){
        return false;
    }
}
