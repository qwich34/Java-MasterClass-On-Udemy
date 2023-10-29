public class TestSimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(1.125);
        calc.setSecondNumber(4.125);
        System.out.println(calc.getSubtractionResult());

        System.out.println(calc.getAdditionResult());

        System.out.println(calc.getDivisionResult());

        System.out.println(calc.getMultiplicationResult());

        System.out.println(calc.getFirstNumber());

        System.out.println(calc.getSecondNumber());


    }
}
