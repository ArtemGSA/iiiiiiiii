package org.skypro.skyshop.defineclass;

public class Article implements org.skypro.skyshop.interfaces.Searchable {
    private final String name;
    private final String text;
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
