package org.skypro.skyshop.product;

public abstract class Product {
    private final String nameProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public abstract int getCostProduct();

    public abstract boolean inSpecial();


}
