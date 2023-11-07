package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>(5000);
    }

    public boolean addCustomer(String name, double initialDeposit) {
        if(findCustomer(name) == null) {
            customers.add(new Customer(name, initialDeposit));
            System.out.println("New Customer added: " + customers);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for(var customer : customers) {
            if(customer.getName().equalsIgnoreCase(name))
                return customer;
        }
        System.out.printf("Customer (%s) wasn't found %n", name);
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = findCustomer(name);
        if(customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }
    public void printStatement(String name) {
        Customer customer = findCustomer(name);
        if(customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Transactions: ");
        for(double d : customer.transactions()) { //Unboxing
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }
}
