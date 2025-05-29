package org.skypro.skyshop.interfaces;
public interface Searchable {

    boolean isSearchable = true;
    default String searchTerm(){
        return "q";
    }
    String searchType();
    String searchName();
    default String getSringrepresentation(){
        return "имя "+searchName()+" - тип "+searchType();
    }
}
