package org.skypro.skyshop.product;
import java.util.Objects;
public abstract class Product implements Searchable{
    private String name;
    public Product(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public abstract int getPrice();
    public abstract boolean isSpecial();
    @Override
    public String searchType(){
        return "PRODUCT";
    }
    @Override
    public String searchName(){
        return name;
    }
    @Override
    public String searchTerm(){
        return name;
    }

}