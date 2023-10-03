public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
    for(int i = 0; i < 10; i++){
        System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
    }
    System.out.println("\nisPrime():\n");

    int count = 0;

    for(int i = 10; i <= 50; i++){
        if(isPrime(i)){
            System.out.println(i);
            count++;
        if(count == 3){
            break;
        }
        }
    }
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for(int i = 2; i < wholeNumber; i++){
            if(wholeNumber % i == 0){
                return false;
            }
        }

        return true;
    }
}