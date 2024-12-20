package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class Main {
    public static void main(String[] args) {

        Product firstProduct = new Product("чай", 100);
        Product secondProduct = new Product("чай", 100);
        Product thirdProduct = new Product("кофе", 20);
        Product fourthProduct = new Product("яблоко", 150);
        Product fifthProduct = new Product("яблоко", 150);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(firstProduct);
        basket.addProduct(secondProduct);
        basket.addProduct(thirdProduct);
        basket.addProduct(fourthProduct);
        basket.addProduct(fifthProduct);

        basket.addProduct(firstProduct);

        basket.listBasket();

        System.out.println("Сумма товаров в корзине: " + basket.sumBasket() + " руб");

        System.out.println(basket.checkProduct("яблоко"));
        System.out.println(basket.checkProduct("морковь"));

        basket.cleanBasket();

        basket.listBasket();

        System.out.println("Сумма товаров в корзине: " + basket.sumBasket() + " руб");

        System.out.println(basket.checkProduct("морковь"));


    }

}