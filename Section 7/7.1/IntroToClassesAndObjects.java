public class IntroToClassesAndObjects {
    public static void main(String[] args) {
        Car car = new Car();

        // Encapsulated data, has a private field, so I cannot have an access to it.
        // car.make() = "Porsche"
        // car.model() = "Carrera"
        // car.color() = "Blue"
        // System.out.println("make = " + car.make());
        // System.out.println("model = " + car.model());

        // To avoid this problem, you must create a getter, that will not affect protected data field.
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
