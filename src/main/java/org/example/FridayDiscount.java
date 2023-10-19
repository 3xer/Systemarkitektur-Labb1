package org.example;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class FridayDiscount extends BaseDiscount{
    public FridayDiscount(Discount nextDiscount){
        super(nextDiscount, "10% off on Fridays");
    }
    @Override
    protected boolean isApplicable(Product product) {
        return LocalDateTime.now().getDayOfWeek() == DayOfWeek.FRIDAY;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getPrice()*0.1;
    }
}
