package org.skypro.skyshop;

import org.skypro.skyshop.busket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket testPB = new ProductBasket();
        String s = "ggg";
        int u = 100;
        for (int i = 0; i<6; i++){
            Product tt = new SimpleProduct(s, u+i);
            testPB.addProduсt(tt);
        }

        testPB.getBasket();
        System.out.println(testPB.prodInBasket("ggg"));
        System.out.println(testPB.prodInBasket("ggggg"));
        testPB.clearBasket();
        testPB.getBasket();
        testPB.getBasketPrice();
        testPB.prodInBasket("ggg");
        DiscountedProduct a = new DiscountedProduct("qq", 1000, 10);
        testPB.addProduсt(a);
        FixPriceProduct f = new FixPriceProduct("www");
        testPB.addProduсt(f);
        testPB.getBasket();
        a.toString();
        f.toString();;
        System.out.println(testPB.getBasketPrice());
        System.out.println(testPB.prodInBasket("qq"));
    }
}