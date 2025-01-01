package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIX_PRICE_PRODUCT = 50;

    public FixPriceProduct(String nameProduct){
        super(nameProduct);
    }

    @Override
    public int getCostProduct() {
        return FIX_PRICE_PRODUCT;
    }

    @Override
    public boolean inSpecial(){
        return true;
    }

    @Override
    public String toString(){
        return  getNameProduct()+" : Фиксированая цена: "+getCostProduct()+" руб";
    }
}
