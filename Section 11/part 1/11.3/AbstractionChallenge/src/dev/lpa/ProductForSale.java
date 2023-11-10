package dev.lpa;
// Fields: type, price, description
// Methods:
// getSalesPrice, a concrete method, which takes quantity,
// and returns the quantity times the price.
// printPricedLineItem, a concrete method, which takes quantity,
// and should print an itemized line item for an order, with quantity and line item price.
// showDetails, an abstract method, which represents what might be displayed on a product page,
// product type, description, price, and so on.
// Create an OrderItem type(Record) that has at a minimum 2 fields, quantity and a ProductForSale.

// You should create two or three classes, that extend the ProductForSale class,
// that will be products in your store.

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    protected double getSalesPrice(int quantity) {
        return price * quantity;
    }

    protected void printPricedItem(int quantity) {
        System.out.printf(" %n%2d quantity at $%8.2f each,  %-15s %-35s %n",
                quantity, price, type, description);
    }

    protected abstract void showDetails();
    }

