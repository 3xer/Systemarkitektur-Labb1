package org.example;

public class App 
{
    public static void main( String[] args )
    {
    Product product = new Product("milk", 10, 7);
    Discount dicountPrice =  new FridayDiscount(new MilkDiscount(new QuantityDiscount(null)));
        System.out.println(dicountPrice.apply(product));
        System.out.println(dicountPrice.getDescription(product));
    }
}
