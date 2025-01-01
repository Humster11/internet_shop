package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class Main {
    public static void main(String[] args) {

        SimpleProduct firstProduct = new SimpleProduct("чай", 100);
        FixPriceProduct secondProduct = new FixPriceProduct("банан");
        DiscountedProduct thirdProduct = new DiscountedProduct("огурец",150,5);

        ProductBasket basket = new ProductBasket();
        basket.addProduct(firstProduct);
        basket.addProduct(secondProduct);
        basket.addProduct(thirdProduct);


        basket.listBasket();


    }

}