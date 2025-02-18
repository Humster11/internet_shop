package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ProductBasket {
    private ArrayList<Product> products = new ArrayList<Product>();
    private int countProducts = 0;
    private int countSpecialProducts = 0;

    public ProductBasket() {

    }

    public void addProduct(Product product) {
        for (int i = 0; i <= products.size(); i++) {
            products.add(product);
            countProducts = countProducts + 1;
            if (product.inSpecial()) {
                countSpecialProducts = countSpecialProducts + 1;
            }
            break;
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
        if (countProducts == 0) {
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

        if (countProducts == 0) {
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
        countProducts = 0;
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
