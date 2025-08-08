package org.skypro.skyshop;

import org.skypro.skyshop.busket.ProductBasket;
import org.skypro.skyshop.defineclass.*;
import org.skypro.skyshop.engine.SearchEngine;
import org.skypro.skyshop.exceptions.BestResultNotFoundException;
import org.skypro.skyshop.interfaces.Searchable;
import org.skypro.skyshop.pubclass.Product;

import java.util.Arrays;

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
        Article article = new Article("ggg", "rrrrrrrrr");
        System.out.println(article.toString());
        System.out.println(f.getSringrepresentation());
        Article astic = new Article("fff", "ttttttttt");
        SearchEngine testEngine  = new SearchEngine(10);
        testEngine.add(a);
        testEngine.add(f);
        testEngine.add(article);
        testEngine.add(astic);
        System.out.println(Arrays.toString(testEngine.search("www")));
        System.out.println(Arrays.toString(testEngine.search("fff")));
        try {
            SimpleProduct spBroken = new SimpleProduct("", 12);
        } catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            SimpleProduct spBroken2 = new SimpleProduct("qq", 0);
        }catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            DiscountedProduct dpBroken = new DiscountedProduct("qqq", 0, 12);
        } catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            DiscountedProduct dpBroken2 = new DiscountedProduct("qqq", 22, 112);
        } catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try{
            DiscountedProduct dpBroken3 = new DiscountedProduct("qqq", 33, -2);
        } catch(IllegalArgumentException e){
            System.out.println(e);
        }
        try {
            Searchable asd = testEngine.mostRelevant("ggg");
            System.out.println(asd.getSringrepresentation());
        }catch (BestResultNotFoundException e){
            System.out.println(e);
        }
        try{
            Searchable ads = testEngine.mostRelevant("tututu");
            System.out.println(ads.getSringrepresentation());
        }catch (BestResultNotFoundException e){
            System.out.println(e);
        }
    }
}