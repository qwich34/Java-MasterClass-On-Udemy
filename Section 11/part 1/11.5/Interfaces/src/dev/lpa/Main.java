package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnable flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move();
//        bird.move();

        flier.takeOff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}
