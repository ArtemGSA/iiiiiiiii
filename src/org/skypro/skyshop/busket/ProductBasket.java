package org.skypro.skyshop.busket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private int productCount = 0;
    private Product[] productBasket = new Product[5];
    public void addProduсt(Product p){
        if (productCount<5){
            productBasket[productCount]=p;
            productCount+=1;
        }
        else{
            System.out.println("Корзина переполнена!");
        }
    }
    public int getBasketPrice(){
        int totalPrice = 0;
        for (int i=0;i<5;i++){
            totalPrice+=productBasket[i].getPrice();
        }
        return totalPrice;
    }
    public void getBasket(){
        for(int i= 0; i<5; i++){
            System.out.println(productBasket[i].getName()+": "+productBasket[i].getPrice());
        }
        System.out.println("Итого: "+getBasketPrice());
    }
    public boolean prodInBasket(String name){
        for(int i = 0;i<5;i++) {
            if (productBasket[i].getName() == name){
                return true;
            }
        }
        return false;
    }
    public void clearBasket(){
        for(int i = 0;i<5;i++){
            productBasket[i] = null;
        }
    }

}
