package dev.lpa;

public class MilkObject extends ProductForSale {

    public MilkObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        System.out.printf("This %s was taken from the healthiest cows on a farm!%nFor only $%1.2f read carefully " +
                "the description of this product:%n%s", type, price, description);
    }
}
