package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {
        printArray(3);

    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] unSortedArray = new int[size];

        for(int i = 0; i < unSortedArray.length; i++) {
            System.out.print("Element " + i + " contents ");
            int input = scanner.nextInt();
            unSortedArray[i] = input;
        }
    return unSortedArray;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);
        for(int i = 0; i < sortedArray.length - 1; i++) {
            for(int j = i+1; j < sortedArray.length; j++) {
                if(sortedArray[i] < sortedArray[j]){
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray (int size) {
        int[] unsortedArray = getIntegers(size);
        int[] sortedArray = sortIntegers(unsortedArray);

        System.out.println();
        System.out.println("-".repeat(25));
        System.out.print("Array contains: ");
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }
    public static void printArray (int[] getInteger) {
        int[] sortedArray = sortIntegers(getInteger);

        System.out.println();
        System.out.println("-".repeat(25));
        System.out.print("Array contains: ");
        for (int element : sortedArray) {
            System.out.print(element + " ");
        }
    }
}
