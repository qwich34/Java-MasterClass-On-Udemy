package dev.lpa;

import java.util.ArrayList;

// Manage a list of products for sale, including the product details.
// Manage an order, which can just be a list of OrderItem objects.
// Have methods to add an item to the order, and print the ordered items,
// So it looks like a sales receipt.
record OrderItem(int quantity, ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new BreadObject("White Bread",
                1350, "Amazing and tasteful piece of joy!"));

        storeProducts.add(new BreadObject("Brown Bread", 1234,
                "Bronze bread of a masterpiece from Himalayas"));

        storeProducts.add(new MilkObject("Fat free milk", 250,
                "Fat free! Just imagine being skinny just once:D"));
        storeProducts.add(new MilkObject("Heavy cream", 650,
                "free Fats! Just be yourself it's tasty and creamy:D"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 1, 1);
        addItemToOrder(order2, 2, 3);
        printOrder(order2);

    }


    private static void listProducts () {
        for(var item : storeProducts) {
            System.out.println();
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity) {
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for(var item : order) {
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
