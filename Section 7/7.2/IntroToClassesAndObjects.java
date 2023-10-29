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

        System.out.println("\n\n");

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("Blue");
        car.setDoors(3);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        System.out.println("\n\n");

        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setColor("Blue");
        car.setDoors(3);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        System.out.println("\n\n");

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("purple");
        targa.setDoors(2);
        targa.setConvertible(false);
        System.out.println("make = " + targa.getMake());
        System.out.println("model = " + targa.getModel());
        targa.describeCar();
    }
}
