package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.*;


public class ProductBasket {
    private List<Product> products = new ArrayList<>();
    private Map<String, List<Product>> basket = new HashMap<>();

    private int countSpecialProducts = 0;

    public ProductBasket() {

    }

    public void addProduct(Product product) {

        products.add(product);
        basket.put("basket", products);
        if (product.inSpecial()) {
            countSpecialProducts = countSpecialProducts + 1;
        }
    }

    public int sumBasket() {
        int sum = 0;
        for (List<Product> productList: basket.values()){
            for (int i = 0; i <= productList.size() - 1; i++){
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
            for (List productList : basket.values()) {
                for (int i = 0; i <= productList.size() - 1; i++) {
                    System.out.println(productList.get(i));
                }
                System.out.println(basket.get("basket"));
                System.out.println("Итого: " + sumBasket() + " руб");
                System.out.println("Специальных товаров: " + countSpecialProducts + " штук");
            }
        }
    }


    public boolean checkProduct(String nameProduct) {
        boolean check = false;

        if (basket.size() == 0) {
            System.out.println("Корзина пустая");
        } else {
            for (List<Product> productList : basket.values()) {
                for (int i = 0; i <= productList.size() - 1; i++) {
                    if (productList.get(i).getNameProduct() == nameProduct) {
                        check = true;
                    }
                }
            }
        }
        return check;

    }

    public void cleanBasket() {
        products.removeAll(Collections.singleton(null));
        basket.remove("basket");
    }

    public void cleanBasketByNameProduct(String nameProduct) {
        Iterator<Product> iterator = products.iterator();
        System.out.println("Удалённые продукты: ");
        for (List<Product> productList : basket.values()) {
            for (int i = 0; i <= productList.size() - 1; i++) {
                if (productList.get(i).getNameProduct()==nameProduct){
                    System.out.println(productList.get(i).getNameProduct());
                    productList.remove(i);
                }
            }

        }


    }


}
