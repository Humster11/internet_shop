package org.skypro.skyshop.product;

public class SimpleProduct extends Product {

    private final int costProduct;

    public SimpleProduct(String nameProduct, int costProduct) {
        super(nameProduct);
        this.costProduct = costProduct;
    }

    @Override
    public int getCostProduct() {
        return this.costProduct;
    }

    @Override
    public boolean inSpecial(){
        return false;
    }

    @Override
    public String toString(){
        return  getNameProduct()+" :"+getCostProduct()+" руб";
    }


}
