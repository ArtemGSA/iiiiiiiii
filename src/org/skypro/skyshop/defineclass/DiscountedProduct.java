package org.skypro.skyshop.defineclass;

import org.skypro.skyshop.pubclass.Product;

public class DiscountedProduct extends Product {
    private int basicPrice;
    private int discountInIntPrecentages;

    public DiscountedProduct(String name, int basicPrice, int discountInIntPrecentages) {
        super(name);
        if (basicPrice>0) {
            this.basicPrice = basicPrice;
        }
        else{
            throw new IllegalArgumentException(basicPrice + " price is 0 or lower");
        }
        if((0<=discountInIntPrecentages)&(discountInIntPrecentages<=100)) {
            this.discountInIntPrecentages = discountInIntPrecentages;
        }
        else{
            if(discountInIntPrecentages>100){
                throw new IllegalArgumentException(discountInIntPrecentages+" discount is more than 100%");
            }
            else{
                throw new IllegalArgumentException(discountInIntPrecentages + " discount is less than 0%");
            }
        }
    }

    public int getDiscountInIntPrecentages() {
        return discountInIntPrecentages;
    }

    @Override
    public int getPrice(){
        int pp = basicPrice/100*(100-discountInIntPrecentages);
        return pp;
    }
    @Override
    public String toString() {
        return (this.getName()+": "+this.getPrice()+" (скидка )"+getDiscountInIntPrecentages()+'%');
    }
    @Override
    public boolean isSpecial(){
        return true;
    }
}