package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));
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
}