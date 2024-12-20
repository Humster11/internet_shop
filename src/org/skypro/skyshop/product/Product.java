package org.skypro.skyshop.product;

public class Product {
    private String nameProduct;
    private int costProduct;

    public Product(String nameProduct, int costProduct) {
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    public String getNameProduct(){
        return this.nameProduct;
    }

    public int getCostProduct() {
        return this.costProduct;
    }

    public String toString(){
        return this.nameProduct+": "+this.costProduct;
    }


}
