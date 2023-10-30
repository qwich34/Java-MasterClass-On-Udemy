public class TestCarObjectClass {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2021 Black BMW X6 M",5.6,8);
        runRace(ferrari);

        Car tesla = new ElectricCar("2023 Red Tesla Model X", 24.3, 100);
        runRace(tesla);

        Car toyota = new HybridCar("2010 Silver Toyota Corolla", 20.3, 31.3, 20, 2);
        runRace(toyota);
    }

    public static void runRace(Car car) {
        System.out.println(car.getDescription());
        car.startEngine();
        car.drive();
        System.out.println("_ ".repeat(20));
    }


}
