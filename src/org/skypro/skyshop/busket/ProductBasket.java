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
        if(productBasket[0]!=null) {
            int totalPrice = 0;
            for (int i = 0; i < 5; i++) {
                totalPrice += productBasket[i].getPrice();
            }
            return totalPrice;
        }
        else {
            System.out.println("Корзина пока пуста");
            return 0;
        }
    }
    public void getBasket(){
        if(productBasket[0]!=null) {
            for (int i = 0; i < 5; i++) {
                System.out.println(productBasket[i].getName() + ": " + productBasket[i].getPrice());
            }
            System.out.println("Итого: " + getBasketPrice());
        }
        else {
            System.out.println("Корзина пока пуста");
        }
    }
    public boolean prodInBasket(String name){
        if(productBasket[0]!=null) {
            for(int i = 0;i<5;i++) {
                if (productBasket[i].getName() == name){
                    return true;
                }
            }
        }
        else {
            System.out.println("Корзина пока пуста");
        }
        return false;
    }
    public void clearBasket(){
        for(int i = 0;i<5;i++){
            productBasket[i] = null;
        }
    }

}
