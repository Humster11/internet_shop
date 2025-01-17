package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class ProductBasket {
    private Product[] products = new Product[5];
    private int countProducts = 0;
    private int countSpecialProducts = 0;

    public ProductBasket() {

    }

    public void addProduct(Product product) {
        if (countProducts > products.length - 1) {
            System.out.println("В корзине больше нет места");
        }
        for (int i = 0; i <= products.length - 1; i++) {
            if (products[i] == null) {
                products[i] = product;
                countProducts = countProducts + 1;
                if (product.inSpecial()){
                    countSpecialProducts = countSpecialProducts + 1;
                }
                break;
            }
        }
    }

    public int sumBasket() {
        int sum = 0;
        for (int i = 0; i <= products.length - 1; i++) {
            if (products[i] == null) {
                products[i] = new SimpleProduct(" ", 0);
            }
            sum = sum + products[i].getCostProduct();
        }
        return sum;
    }

    public void listBasket() {
        if (countProducts == 0) {
            System.out.println("Корзина пустая");
        } else {
            for (int i = 0; i <= products.length - 1; i++) {
                if (products[i] != null) {
                    System.out.println(products[i].toString());
                }
            }
            System.out.println("Итого: " + sumBasket() + " руб");
            System.out.println("Специальных товаров: " + countSpecialProducts + " штук");
        }
    }


    public boolean checkProduct(String nameProduct) {
        boolean check = false;

        if (countProducts == 0) {
            System.out.println("Корзина пустая");
        } else {
            for (int i = 0; i <= products.length - 1; i++) {
                if (products[i] != null) {
                    if (products[i].getNameProduct() == nameProduct) {
                        check = true;
                    }
                }
            }
        }
        return check;

    }

    public void cleanBasket() {
        for (int i = 0; i <= products.length - 1; i++) {
            products[i] = null;
        }
        countProducts = 0;
    }

}
