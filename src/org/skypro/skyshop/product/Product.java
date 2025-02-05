package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String nameProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public abstract int getCostProduct();

    public abstract boolean inSpecial();

    @Override
    public String getSearchTerm() {
        return getNameProduct();
    }

    @Override
    public String getTypeContent() {
        return "PRODUCT";
    }

    @Override
    public String getNameSearchable() {
        return getNameProduct();
    }



}
