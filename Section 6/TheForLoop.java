public class TheForLoop {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for(double i = 2.0; i <= 5.0; i++){
            System.out.println("10'000$ at " + i + "% interest rate = " + calculateInterest(10000, i));
        }

        System.out.println();

        for(double i = 7.5; i <= 10.0; i += 0.25){
            System.out.println("10'000$ at " + i + "% interest rate = $" + calculateInterest(100, i));
        }

        System.out.println();

        for(double i = 7.5; i <= 10.0; i += 0.25){
            if(i > 8.5){
                break;
            }
            System.out.println("10'000$ at " + i + "% interest rate = $" + calculateInterest(100, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100.0));
    }
}