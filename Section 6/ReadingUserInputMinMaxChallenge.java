import java.util.InputMismatchException;
import java.util.Scanner;
public class ReadingUserInputMinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        boolean isValidNumber = true;
        int count = 0;

        System.out.println("You can type either Integer or Double numbers, to quit the program type any Character.");
        while(isValidNumber){
            try {
                System.out.println("Enter a number: ");
                double number = scanner.nextDouble();
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
                count++;
            } catch (InputMismatchException badUserData) {
                isValidNumber = false;
            }

    }
        scanner.close();
        if(count > 0) {
            System.out.println("min is: " + min);
            System.out.println("max is: " + max);
        } else
            System.out.println("No Valid data entered.");

    }
}
