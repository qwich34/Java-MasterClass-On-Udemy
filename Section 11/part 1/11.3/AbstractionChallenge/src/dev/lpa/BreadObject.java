package dev.lpa;

public class BreadObject extends ProductForSale {

    public BreadObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    protected void showDetails() {
        System.out.printf("This %s was made out of the best wheat!%nFor only $%1.2f read carefully " +
                "the description of this product:%n%s", type, price, description);
    }
}
