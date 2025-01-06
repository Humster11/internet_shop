package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private int baseCost;
    private int discountInWholePercentages;

    public  DiscountedProduct(String nameProduct, int baseCost, int discountInWholePercentages){
        super(nameProduct);
        this.baseCost = baseCost;
        this.discountInWholePercentages = discountInWholePercentages;
    }

    @Override
    public int getCostProduct() {
        int discountedPrice = 0;
        return discountedPrice = baseCost/100*discountInWholePercentages;
    }

    @Override
    public boolean inSpecial(){
        return true;
    }

    @Override
    public String toString(){
        return  getNameProduct()+" :"+getCostProduct()+" руб (Скидка "+discountInWholePercentages+" %)";
    }
}
