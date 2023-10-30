public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public String getDescription() {
        return description;
    }
}
class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 80;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> All %d kWh are charged, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> usage exceeds the average: %.2f kWh %n", avgKmPerCharge);
    }

}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private double avgKmPerCharge;
    private int batterySize = 80;
    private int cylinders = 2;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter,
                     double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> All %d kWh are charged," +
                " all %d cylinders are fired up Ready!%n", batterySize, cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> usage exceeds the average " +
                "consumption for battery: %.2f kWh, and gasoline: %.2f %n", avgKmPerCharge, avgKmPerLiter);
    }
}
