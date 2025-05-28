package org.skypro.skyshop.product;

public class Article implements Searchable{
    private String name;
    private String text;
    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }
    @Override
    public String toString(){
        String s = name + "\n"+text;
        return s;
    }
    @Override
    public String searchTerm(){
        return this.toString();
    }

    @Override
    public String searchType(){
        return "ARTICLE";
    }

    @Override
    public String searchName() {
        return name;
    }
}
