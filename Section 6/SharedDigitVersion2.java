public class SharedDigitVersion2 {
    public static void main(String[] args) {
    
        System.out.println(hasSharedDigit(12,21));
        
    }
    public static boolean hasSharedDigit(int num1, int num2) {
    
        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99)
            return false;

        return(num1 / 10 == num2 / 10 || num1 % 10 == num2 % 10 
              || num1 / 10 == num2 % 10 || num1 % 10 == num2 / 10);
    }

}