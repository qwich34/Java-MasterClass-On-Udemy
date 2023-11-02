package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
//        System.out.println(Arrays.toString(array));
//        System.out.println(findMin(array));

//        reverse(array);
//        System.out.println("Final: " + Arrays.toString(array));


        int[] reverseCopy = reverseCopy(array);
        System.out.println("After reverse " + Arrays.toString(reverseCopy));
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        System.out.println("Enter an list of integers, separated by commas:");
        input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int element : array){
            if(element < min){
                min = element;
            }
        }
    return min;
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

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--->" + Arrays.toString(array));
        }

    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int element : array) {
            reversedArray[maxIndex--] = element;
        }

        return reversedArray;
    }
}