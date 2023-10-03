public class NumberPalindrome {
 
 public static boolean isPalindrome(int number){
 
        int reverse = 0;
        int lastDigit = 0;
        int nCopy = number;
         while(number != 0){
            lastDigit = (number % 10);
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        reverse += number;
        
        if(nCopy == reverse){
            return true;
        }
        return false;
 }
}