public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(32, 3));
        System.out.println(getDurationString(6500));
        System.out.println(getDurationString(0,6500));


    }

    public static String getDurationString (int seconds){
        if(seconds >= 0) {

            return getDurationString(seconds % 60, seconds / 60);
        }
        else
            return "Invalid input.";


    }

    public static String getDurationString (int seconds, int minutes){
        if(seconds >= 0 && seconds <= 59 && minutes >= 0){
            int minuteToHour = minutes / 60;
            int minuteRemaining = minutes % 60;

            return minuteToHour + "h " + minuteRemaining + "m " + seconds + " s.";
        }
        else
            return "invalid input.";



    }

}