package org.example;

public class QuantityDiscount extends BaseDiscount{
    public QuantityDiscount(Discount nextDiscount){
        super(nextDiscount, "10Kr off for every product min 5 items");

    }
    @Override
    protected boolean isApplicable(Product product) {
        return product.getQuantity()>= 5;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getPrice()- (product.getQuantity()*10) ;
    }


}
