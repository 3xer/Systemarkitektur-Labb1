package org.example;

public abstract class BaseDiscount implements Discount {
    private Discount nextDiscount;
    private String description;
    public BaseDiscount(Discount nextDiscount, String description){
        this.nextDiscount = nextDiscount;
        this.description = description;
    }
protected abstract boolean isApplicable(Product product);
protected abstract double calculateDiscount(Product product);
public Discount discount;

    @Override
    public double apply(Product product) {
        double nextDiscountValue = 0;
        if (nextDiscount != null){
            nextDiscountValue = nextDiscount.apply(product);
        }
        if(isApplicable(product)) {
            return calculateDiscount(product) + nextDiscountValue;
        }
        return nextDiscountValue;
    }

    @Override
    public String getDescription(Product product) {
        String nextDiscountValue = "";
        if (nextDiscount != null){
            nextDiscountValue = nextDiscount.getDescription(product);
        }
        if(isApplicable(product)) {
            return description + " - " + nextDiscountValue;
        }
        return nextDiscountValue;
    }

}
