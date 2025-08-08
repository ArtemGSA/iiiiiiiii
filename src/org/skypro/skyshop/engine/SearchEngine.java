package org.skypro.skyshop.engine;

import org.skypro.skyshop.exceptions.BestResultNotFoundException;
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
    public Searchable mostRelevant(String search) throws BestResultNotFoundException{
        int maxNum = 0;
        int num = 0;
        int idOfMax = -1;
        int ind = 0;
        for (int i=0; i<currentLength; i++) {
            num = 0;
            ind = 0;
            String str = searchables[i].searchTerm();
            int substrInd = str.indexOf(search, ind);
            while (substrInd != -1){
                num++;
                ind = substrInd+search.length();
                substrInd = str.indexOf(search, ind);
            }
            if(maxNum<num){
                maxNum = num;
                idOfMax = i;
            }
        }
        if(idOfMax!=-1) {
            return searchables[idOfMax];
        }
        else{
            throw new BestResultNotFoundException(search+" ");
        }
    }
}
