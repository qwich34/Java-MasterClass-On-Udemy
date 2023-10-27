import java.util.Scanner;
public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        System.out.println(getInputFromScanner(5));
    }

    public static int getInputFromScanner(int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        do {
            System.out.println("Enter number #" + count + ":");
            try {
                String number = scanner.nextLine();
                int numberToInt = Integer.parseInt(number);
                sum += numberToInt;
                count++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number.");
            }
        } while (count <= maxNumber);
        scanner.close();
        return sum;
    }

}
