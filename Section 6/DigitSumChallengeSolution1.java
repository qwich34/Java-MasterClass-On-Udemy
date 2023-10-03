public class DigitSumChallengeSolution1 {
    public static void main(String[] args) {

        System.out.println("The sum of number 6321 is: " + sumDigits(6321));
    }

    public static int sumDigits(int number){
        int sum = 0;
        int digits = 0;
        if(number > 0){
            for(int i = 0; i <= number; i++){
                digits = number % 10;
                sum += digits;
                number /= 10;

            }
        } else {
            return -1;
        }
        return sum;
    }
}