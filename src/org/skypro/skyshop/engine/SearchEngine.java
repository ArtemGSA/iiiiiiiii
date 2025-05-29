package org.skypro.skyshop.engine;

import org.skypro.skyshop.interfaces.Searchable;

public class SearchEngine{
    private Searchable[] searchables;
    private int length = 0;
    private int currentLength = 0;
    public SearchEngine(int length) {
        this.searchables =new Searchable[length];
        this.length=length;
    }
    public Searchable[] search(String sTerm){
        Searchable[]searchAns= new Searchable[5];
        int j = 0;
        int i = 0;
        while ((i<currentLength)&(j<5)){
            if(searchables[i].searchTerm().contains(sTerm)) {
                searchAns[j] = searchables[i];
                j++;
            }
            i++;
        }
        return searchAns;
    }
    public void add(Searchable sAdd){
        if(currentLength<length){
            int t = 0;
            for (int i = 0; i<currentLength;i++){
                if(sAdd == searchables[i]){
                    t = 1;
                    break;
                }
            }
            if(t==0) {
                this.searchables[currentLength] = sAdd;
            }
            currentLength += 1;
        }
    }
}
