public class TestFloor {
    public static void main(String[] args) {
        Floor floor = new Floor(12,13);
        Carpet carpet = new Carpet(27);
        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("$" + calculator.getTotalCost());
    }
}
