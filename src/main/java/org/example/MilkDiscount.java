package org.example;

public class MilkDiscount extends BaseDiscount{

    public MilkDiscount(Discount nextDiscount){
        super(nextDiscount, "5% off milk");
    }
    @Override
    protected boolean isApplicable(Product product) {
        return product.getName().equals("milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getPrice()*0.05;
    }
}
