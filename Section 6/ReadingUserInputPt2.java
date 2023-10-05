public class ReadingUserInputPt2 {
    public static void main(String[] args) {
        int currentYear = 2023;
        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
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

        return "";
    }
}
