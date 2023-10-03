public class MoreSwitchStatements {
    public static void main(String[] args) {

        int switchValue = 1;
    
        // Enhanced Switch statement
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1.");
            case 2 -> System.out.println("Value was 2.");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, or a 5");
        }
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    
    // Enhanced Switch statement
    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}