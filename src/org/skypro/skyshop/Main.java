package org.skypro.skyshop;

import org.skypro.skyshop.info.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SimpleProduct firstProduct = new SimpleProduct("чай", 100);
        FixPriceProduct secondProduct = new FixPriceProduct("банан");
        DiscountedProduct thirdProduct = new DiscountedProduct("огурец",150,5);

        /*ProductBasket basket = new ProductBasket();
        basket.addProduct(firstProduct);
        basket.addProduct(secondProduct);
        basket.addProduct(thirdProduct);
        basket.listBasket();*/

        Article firstArticle = new Article("Свойства чая","Чаи бывают разные. Чай имеет много положительных свойств для организма");
        Article secondArticle = new Article("Хлеб","Хлеб имеет множество рецептов таких как...");
        Article thirdArticle = new Article("Огурец","Огурец является овощем");
        Article fourthArticle = new Article("Огурец","Огурец является овощем");

        SearchEngine search = new SearchEngine(5);
        search.add(firstProduct);
        search.add(firstArticle);
        search.add(secondArticle);
        search.add(secondProduct);
        search.add(thirdArticle);
        search.add(fourthArticle);


        String[] resultSearch = search.search("а");
        System.out.println(Arrays.toString(resultSearch));


    }

}