package dev.lpa;

public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
//        OrbitEarth.log("Testing" + new Satellite());
        orbit(new Satellite());
    }

    private static void inFlight(FlightEnable flier) {
        System.out.println("-".repeat(30));
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
        System.out.println("-".repeat(30));
    }

    private static void orbit(OrbitEarth flier) {
        System.out.println("-".repeat(30));
        flier.takeOff();
        flier.fly();
        flier.land();
        System.out.println("-".repeat(30));
    }
}
