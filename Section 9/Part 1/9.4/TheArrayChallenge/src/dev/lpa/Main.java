package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = getRandomArray(10);
        int[] intCopyArray = Arrays.copyOf(intArray,10);
        Arrays.sort(intCopyArray);

        System.out.println("original instance of an array:\n"
                + Arrays.toString(intArray));

        System.out.println("\nCopied and sorted array:\n"
                +Arrays.toString(intCopyArray));


        System.out.println("\nSorted array by whileFor loop:\n"
                + Arrays.toString(sortIntegers(intCopyArray)));

        sortIntegersFor(intCopyArray);
        System.out.println("\nSorted array by ForFor loop:\n"
                + Arrays.toString(sortIntegers(intCopyArray)));

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static int[] sortIntegersFor(int[] array) {
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
}

