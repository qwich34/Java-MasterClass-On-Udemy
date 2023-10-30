public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String startEngine() {
        String startEngine = String.format("%s -> startEngine() %n", getClass().getSimpleName());
        return startEngine;
    }

    public String accelerate() {
        String accelerate = String.format("%s -> accelerate() %n", getClass().getSimpleName());
        return accelerate;
    }

    public String brake() {
        String brake = String.format("%s -> brake() %n", getClass().getSimpleName());
        return brake;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

