public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double decimal1, double decimal2){
        if(((int)(decimal1 * 1000.0) / 1000.0) == ((int)(decimal2 * 1000.0) / 1000.0))
            return true;
        else
            return false;
        
    }
 
}