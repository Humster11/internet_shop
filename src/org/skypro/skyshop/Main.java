package org.skypro.skyshop;

import org.skypro.skyshop.exception.BestResultNotFound;
import org.skypro.skyshop.info.Article;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.basket.ProductBasket;


import java.util.*;

public class Main {
    public static void main(String[] args) throws BestResultNotFound {

        /*Проверка работы исключений*/

        /*try {
            SimpleProduct firstProduct = new SimpleProduct(" ", 100);
        } catch (IllegalArgumentException e){
            System.out.println("Не введено название продукта");
        }

        try {
            SimpleProduct firstProduct = new SimpleProduct("Чай", 0);
        } catch (IllegalArgumentException e){
            System.out.println("Цена продукта должна быть больше 0");
        }


        try {
            DiscountedProduct thirdProduct = new DiscountedProduct("огурец",0,5);
        } catch (IllegalArgumentException e){
            System.out.println("Цена продукта должна быть больше 0");
        }

        try {
            DiscountedProduct thirdProduct = new DiscountedProduct("огурец",0,500);
        } catch (IllegalArgumentException e){
            System.out.println("Скидка может быть от 0 до 100%");
        }*/
        /*Проверка работы исключений*/



        SimpleProduct firstProduct = new SimpleProduct("чай", 100);
        FixPriceProduct secondProduct = new FixPriceProduct("банан");
        DiscountedProduct thirdProduct = new DiscountedProduct("Огурец",150,5);
        DiscountedProduct lastProduct = new DiscountedProduct("помидор",150,5);

        /*ProductBasket basket = new ProductBasket();
        basket.addProduct(firstProduct);
        basket.addProduct(secondProduct);
        basket.addProduct(thirdProduct);
        basket.addProduct(lastProduct);
        System.out.println(basket.sumBasket());

        basket.cleanBasketByNameProduct("огурец");
        basket.listBasket();
        System.out.println(basket.checkProduct("чай"));
        basket.cleanBasket();*/

        Article firstArticle = new Article("Свойства чая","Чаи бывают разные. Чай имеет много положительных свойств для организма");
        Article secondArticle = new Article("Хлеб","Хлеб имеет множество рецептов таких как...");
        Article thirdArticle = new Article("Огурец","Огурец является овощем");
        Article fourthArticle = new Article("Огурцы","Огурец является овощем и очень полезен");

        SearchEngine search = new SearchEngine();
        search.add(firstProduct);
        search.add(firstArticle);
        search.add(secondArticle);
        search.add(secondProduct);
        search.add(thirdArticle);
        search.add(fourthArticle);
        search.add(thirdProduct);
        search.add(lastProduct);




        //ArrayList<String> resultSearch = new ArrayList<String>(search.search("а"));
        System.out.println(search.search("а"));
        System.out.println(search.search("Огур"));


        /*Проверка работы метода поиска*/
        //System.out.println(search.searchInSearhable("Хлеб"));
        /*Проверка работы метода поиска*/

        /*Проверка собствеенного исключения*/
        /*try {
            search.searchInSearhable("Морс");
        } catch (BestResultNotFound e){
            System.out.println("Объёект поиска не найден");
        }*/
        /*Проверка собственного исключения*/






    }

}