
/*
        Escape Sequences:
        \t = Insert a tab(key on a keyboard) character.
        \n = Insert a new line character.
        \" = Insert a double quote character
        // = Insert a backslash character.

 */


public class StringFormatting {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;

        System.out.printf("%nYour age is %d", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("%nAge = %d, Birth year = %d", age, yearOfBirth);

        System.out.printf("%nYour age is %.2f%n%n", (float)age); //Cast to avoid Conversion error.

        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("%nString.format() method: Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "%nYour age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
