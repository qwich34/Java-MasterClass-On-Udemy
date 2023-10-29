public class Customer {
    private String customerName;
    private String customerEmail;
    private double customerCreditLimit;

    public Customer(){
        this("Default name", "Default @Email");
        System.out.println("No args constructor.");
    }

    public Customer(String customerName, String customerEmail) {
        this(customerName, customerEmail, 0);
    }

    public Customer(String customerName, String customerEmail, double customerCreditLimit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerCreditLimit = customerCreditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getCustomerCreditLimit() {
        return customerCreditLimit;
    }
}
