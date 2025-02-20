package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProductBasket {
    private List<Product> products = new ArrayList<>();

    private int countSpecialProducts = 0;

    public ProductBasket() {

    }

    public void addProduct(Product product) {

            products.add(product);
            if (product.inSpecial()) {
                countSpecialProducts = countSpecialProducts + 1;
            }

    }


    public int sumBasket() {
        int sum = 0;
        for (int i = 0; i <= products.size() - 1; i++) {
            sum = sum + products.get(i).getCostProduct();
        }
        return sum;
    }

    public void listBasket() {
        if (products.size() == 0) {
            System.out.println("Корзина пустая");
        } else {
            System.out.println("Текущий список продуктов: ");
            for (int i = 0; i <= products.size() - 1; i++) {
                if (products.get(i) != null) {
                    System.out.println(products.get(i).toString());
                }
            }
            System.out.println("Итого: " + sumBasket() + " руб");
            System.out.println("Специальных товаров: " + countSpecialProducts + " штук");
        }
    }


    public boolean checkProduct(String nameProduct) {
        boolean check = false;

        if (products.size() == 0) {
            System.out.println("Корзина пустая");
        } else {
            for (int i = 0; i <= products.size() - 1; i++) {
                if (products.get(i) != null) {
                    if (products.get(i).getNameProduct() == nameProduct) {
                        check = true;
                    }
                }
            }
        }
        return check;

    }

    public void cleanBasket() {
        products.removeAll(Collections.singleton(null));
    }

    public void cleanBasketByNameProduct(String nameProduct) {
        Iterator<Product> iterator = products.iterator();
        System.out.println("Удалённые продукты: ");
        while (iterator.hasNext()) {
            Product element = iterator.next();
            if (element.getNameProduct() == nameProduct) {
                System.out.println(element);
                iterator.remove();
            }
        }
    }


}
