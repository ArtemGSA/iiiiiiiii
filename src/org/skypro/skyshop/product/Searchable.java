package org.skypro.skyshop.product;
interface Searchable {

    boolean isSearchable = true;
    default String searchTerm(){
        return "q";
    }
    default String searchType(){
        return "j";
    }
    default String searchName(){
        return "r";
    }
    default String getSringrepresentation(){
        return "имя "+searchName()+" - тип "+searchType();
    }
}
