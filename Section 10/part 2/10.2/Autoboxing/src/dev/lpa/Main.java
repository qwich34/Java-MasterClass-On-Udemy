package dev.lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        var varList = List.of(1, 2, 3, 4, 5);
        var varrArrayList = getList(1, 2, 3, 4, 5);
        System.out.println(varList);
    }

    private static ArrayList<Integer> getList(Integer... varArgs) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i: varArgs) {
            newList.add(i);
        }
        return newList;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
