package dev.lpa;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        long digit = input.nextLong();

        System.out.println("The sum of the digits is " + sumDigits(digit));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        long temp = n;
        while (n != 0) {
            if(n < 0) {
               n *= -1;
            }
            sum += n % 10;
            n /= 10;


        }
        if(temp < 0) {
            sum *= -1;
        }
        return sum;
    }
}
