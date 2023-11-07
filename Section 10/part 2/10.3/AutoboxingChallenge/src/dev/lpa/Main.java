package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank americanBank = new Bank("americanBank");
        americanBank.addCustomer("Mary", 1200);
        System.out.println(americanBank);

        americanBank.addTransaction("mary", -10.35);
        americanBank.addTransaction("MarY", -75.098);
        americanBank.printStatement("mary");

        americanBank.addCustomer("Bob S", 35);

        americanBank.addTransaction("Bob S", 100);
        americanBank.printStatement("Bob S");
    }
}
