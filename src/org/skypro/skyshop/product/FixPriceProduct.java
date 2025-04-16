package org.skypro.skyshop.product;

public class FixPriceProduct extends Product{
    private static int FIX_PRICE=250;
    public FixPriceProduct(String name){
        super(name);
    }
    @Override
    public int getPrice(){
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return this.getName()+": Фиксированная цена "+FIX_PRICE;
    }
    @Override
    public boolean isSpecial(){
        return true;
    }
}
