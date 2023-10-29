public class TestCustomerClass {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", "tim@email.com", 350);
        System.out.println("Customer name = " + customer.getCustomerName());
        System.out.println("Customer Email = " + customer.getCustomerEmail());
        System.out.println("Customer Credit Limit = $" + customer.getCustomerCreditLimit());

        System.out.println("\n");
        Customer secondCustomer = new Customer();
        System.out.println("Customer name = " + secondCustomer.getCustomerName());
        System.out.println("Customer Email = " + secondCustomer.getCustomerEmail());
        System.out.println("Customer Credit Limit = $" + secondCustomer.getCustomerCreditLimit());

        System.out.println("\n");
        Customer thirdCustomer = new Customer("John", "John@Email.org");
        System.out.println("Customer name = " + thirdCustomer.getCustomerName());
        System.out.println("Customer Email = " + thirdCustomer.getCustomerEmail());
        System.out.println("Customer Credit Limit = $" + thirdCustomer.getCustomerCreditLimit());
    }
}
