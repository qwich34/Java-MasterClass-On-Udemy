public class NumberInWord {
    
    public static void printNumberInWord(int number){
        String numberInWord = "Other";
        if(number == 0)
            numberInWord = "Zero";
        else if(number == 1)
            numberInWord = "One";
        else if(number == 2)
            numberInWord = "Two";
        else if(number == 3)
            numberInWord = "Three";
        else if(number == 4)
            numberInWord = "Four";
        else if(number == 5)
            numberInWord = "Five";
        else if(number == 6)
            numberInWord = "Six";
        else if(number == 7)
            numberInWord = "Seven";
        else if(number == 8)
            numberInWord = "Eight";
        else if(number == 9)
            numberInWord = "Nine";
            
          System.out.println(numberInWord);
    }
}