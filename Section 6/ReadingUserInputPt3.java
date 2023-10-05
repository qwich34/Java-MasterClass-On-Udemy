import java.util.Scanner;
public class ReadingUserInputPt3 {
        public static void main(String[] args) {
            int currentYear = 2023;
            try {
                System.out.println(getInputFromConsole(currentYear));
            } catch(NullPointerException e) {
                System.out.println(getInputFromScanner(currentYear));
            }
        }
        public static String getInputFromConsole(int currentYear){
            //Use the Terminal to start this code below.
            String name = System.console().readLine("Hi, what's your name? ");
            System.out.println("Hi " + name + ", thanks for taking the course!");
            String dateOfBirth = System.console().readLine("What year were you born? ");
            int age = currentYear - Integer.parseInt(dateOfBirth);
            return "So you are " + age + " years old ";
        }
        public static String getInputFromScanner(int currentYear){
            Scanner scanner = new Scanner(System.in);
           // String name = System.console().readLine("Hi, what's your name? ");
            System.out.println("Hi, what's your name? ");
            String name = scanner.nextLine();

            System.out.println("Hi " + name + ", thanks for taking the course!");
            //String dateOfBirth = System.console().readLine("What year were you born? ");

            System.out.println("What year were you born? ");
            String dateOfBirth = scanner.nextLine();

            int age = currentYear - Integer.parseInt(dateOfBirth);
            return "So you are " + age + " years old ";
        }
    }