public class DigitSumChallengeSolution2 {
    public static void main(String[] args) {
        System.out.println("The sum of number 6321 is: " + sumDigits(6321));
 }
    public static int sumDigits(int number){

     if(number < 0){
       return -1;
     }

     int sum = 0;
     
     while(number > 9){
      sum += (number % 10);
      number /= 10;
     }
     
     sum += number;
     return sum;
    }
}