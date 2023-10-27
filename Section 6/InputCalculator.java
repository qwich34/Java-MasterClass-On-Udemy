import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    // Write your code here
    public static void inputThenPrintSumAndAverage(){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    double average = 0d;
    int count = 0;
    while(true){
        try{
            int number = scanner.nextInt();
            sum += number;
            count++;
        }catch (InputMismatchException badUserData){
            average = (double) sum / count;
            average = Math.round(average);
            break;
        }
    }
        System.out.println("SUM = " + sum + " AVG = " + (int)average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}