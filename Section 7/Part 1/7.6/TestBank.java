public class TestBank {
    public static void main(String[] args) {
        Bank dollars = new Bank("999-417-666",215345,"Michael","blablacar@MICHAEL.COM","+7(977)-645-31-91");

//        dollars.setAccountNumber("999-417-666");
//        dollars.setCustomerName("Michael");
//        dollars.setAccountBalance(215345);
//        dollars.setEmail("blablacar@MICHAEL.COM");
//        dollars.setPhoneNumber("+7(977)-645-31-91");

        System.out.println(dollars.toString());

        dollars.setWithdrawal(200000);
        dollars.setDeposit(55);
        dollars.setWithdrawal(300000);
    }
}
