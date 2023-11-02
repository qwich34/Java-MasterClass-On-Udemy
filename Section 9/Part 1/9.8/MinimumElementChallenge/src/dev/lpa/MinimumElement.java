package dev.lpa;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter the size of an Array: ");
        scanner.close();

        return size;
    }

    private static int[] readElements(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[size];

        System.out.println("Enter the elements of the Array: ");
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int element : array) {
            if (element < min){
                min = element;
            }
        }
        return min;
    }
}
