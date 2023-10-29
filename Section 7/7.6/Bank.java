public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(){ //No args constructor
        System.out.println("Empty constructor called.\n");
    }

    public Bank(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Bank account constructor with all parameters called.\n");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDeposit(int deposit){
        this.accountBalance += deposit;
        System.out.println("\nDeposit of $" + deposit + " made. New balance is $" + accountBalance);

    }
    public void setWithdrawal(int withdrawal){
        if((accountBalance - withdrawal) >= 0) {
            this.accountBalance -= withdrawal;
            System.out.println("\nwithdrawal of $" + withdrawal + " processed. Remaining balance is $" + accountBalance);

        } else
            System.out.println("\nInsufficient Funds! You only have $" + accountBalance + " in your account.");

    }

    @Override
    public String toString() {
        return "Bank Account\n" +
                "\naccountNumber = " + accountNumber +
                "\naccountBalance = " + accountBalance +
                "\ncustomerName = '" + customerName +
                "\nemail = '" + email +
                "\nphoneNumber = '" + phoneNumber;
    }
}
