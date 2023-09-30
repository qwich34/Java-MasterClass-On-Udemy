public class SpeedConverter {
   // write your code here
    public static long toMilesPerHour (double kilometersPerHour) {
        double kilometerConverter = kilometersPerHour / 1.609;
        long roundedMiles = Math.round(kilometerConverter);

        return (roundedMiles >= 0) ? roundedMiles : -1;
    }

    public static void printConversion (double kilometersPerHour) {
        System.out.println((kilometersPerHour >= 0) ? kilometersPerHour
                + " km/h = " + toMilesPerHour(kilometersPerHour)
                + " mi/h" : "Invalid Value");
    }
    
}