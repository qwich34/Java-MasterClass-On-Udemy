public class EvenDigitSum {
    // write your code here
        public static int getEvenDigitSum(int number){
            if(number < 0){
            return -1;
            }
            
        int sum = 0;
        int evenSum = 0;
        while(number > 9){
            sum = number % 10;
            number /= 10;
            if(sum % 2 == 0) {
                evenSum += sum;
            }
            if(number <= 9 && number % 2 == 0){
                evenSum +=number;
            }
        }
       return evenSum;
    }
}