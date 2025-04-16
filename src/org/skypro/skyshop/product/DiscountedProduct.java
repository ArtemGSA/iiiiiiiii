package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private int basicPrice;
    private int discountInIntPrecentages;

    public DiscountedProduct(String name, int basicPrice, int discountInIntPrecentages) {
        super(name);
        this.basicPrice = basicPrice;
        this.discountInIntPrecentages = discountInIntPrecentages;
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