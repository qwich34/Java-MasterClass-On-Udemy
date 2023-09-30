public class Hello2 {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I'm scared of Aliens");
        }

        int topScore = 80;
        if (topScore == 100 ) {
            System.out.println("You  got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double sumOfVariables = ((firstVariable + secondVariable) * 100.00d) % 40.00d;
        System.out.println("My remainder of variables = " + sumOfVariables);
        boolean isValid = (sumOfVariables == 0.0) ? true : false;
        System.out.println("isNoRemainder = " + isValid);

        if (!isValid) {
            System.out.println("Got some remainder");
        }

    }
}

