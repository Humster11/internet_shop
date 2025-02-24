package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;


public class ProductBasket {
    private Map<String, List<Product>> basket = new HashMap<>();

    private int countSpecialProducts = 0;

    public ProductBasket() {

    }

    public void addProduct(Product product) {
        if (basket.containsKey(product.getNameProduct())){
            List<Product> productList = basket.get(product.getNameProduct());
            productList.add(product);
            basket.put(product.getNameProduct(),productList);
        }
        else {
            List<Product> products = new ArrayList<>();
            products.add(product);
            basket.put(product.getNameProduct(), products);
        }
        if (product.inSpecial()) {
            countSpecialProducts = countSpecialProducts + 1;
        }
    }

    public int sumBasket() {
        int sum = 0;
        for (List<Product> productList : basket.values()) {
            for (int i = 0; i <= productList.size() - 1; i++) {
                sum += productList.get(i).getCostProduct();
            }
        }
        return sum;
    }

    public void listBasket() {
        if (basket.size() == 0) {
            System.out.println("Корзина пустая");
        } else {
            System.out.println("Текущий список продуктов: ");
            for (String product : basket.keySet()) {
                System.out.println(basket.get(product));
            }
                System.out.println("Итого: " + sumBasket() + " руб");
                System.out.println("Специальных товаров: " + countSpecialProducts + " штук");
        }
    }


    public boolean checkProduct(String nameProduct) {
        boolean check = false;

        if (basket.size() == 0) {
            System.out.println("Корзина пустая");
        } else {
            if (basket.containsKey(nameProduct)){
                check = true;
            }
        }
        return check;

    }

    public void cleanBasket() {
        basket.keySet().removeAll(basket.keySet());

    }

    public void cleanBasketByNameProduct(String nameProduct) {
        System.out.println("Удалённые продукты: ");
        System.out.println(nameProduct);
        basket.remove(nameProduct);

    }


}
