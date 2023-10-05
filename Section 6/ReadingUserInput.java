public class ReadingUserInput {
    public static void main(String[] args) {
        String currentYearString = "2023";
        int currentYear = 2023;
        String usersDateOfBirth = "1986";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he's: " + ageWithPartialYear);
    }
}