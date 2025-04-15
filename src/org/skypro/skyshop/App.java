package org.skypro.skyshop;

import org.skypro.skyshop.busket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket testPB = new ProductBasket();
        String s = "ggg";
        int u = 100;
        for (int i = 0; i<6; i++){
            Product tt = new Product(s, u+i);
            testPB.addProduсt(tt);
        }

        testPB.getBasket();
        System.out.println(testPB.prodInBasket("ggg"));
        System.out.println(testPB.prodInBasket("ggggg"));
        testPB.clearBasket();
        testPB.getBasket();
        testPB.getBasketPrice();
        testPB.prodInBasket("ggg");
    }
}