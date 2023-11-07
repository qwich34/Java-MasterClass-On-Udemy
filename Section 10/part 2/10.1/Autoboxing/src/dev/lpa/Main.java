package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // Preferred but unnecessary
        Integer deprecateBoxing = new Integer(15); //Deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // Unnecessary

        // Automatic
        Integer autoboxed = 15;
        int autoUnboxed = autoboxed;

        System.out.println(autoboxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();


    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
