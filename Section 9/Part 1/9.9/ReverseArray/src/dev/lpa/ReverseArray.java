package dev.lpa;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(array)));

        int[] newArray = new int[] {5, 3, 21, 32, 0};
        System.out.println(Arrays.toString(reverseArray(newArray)));
    }

    private static int[] reverseArray(int[] array) {
        int[] copyOfArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < copyOfArray.length; i++) {
            for (int j = i+1; j < copyOfArray.length; j++) {
                if (copyOfArray[i] < copyOfArray[j]) {
                    int temp = copyOfArray[i];
                    copyOfArray[i] = copyOfArray[j];
                    copyOfArray[j] = temp;
                }
            }
        }
        return copyOfArray;
    }
}
