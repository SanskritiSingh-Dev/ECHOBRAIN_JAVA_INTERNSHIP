package INTERVIEW_QUESTIONS;
//Write a program to find the missing number from an array containing numbers from 1 to N.
//Write a program to find all missing numbers in an unsorted array.

import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // missing number from an array containing 1..N with one element missing
        // assuming the array length is n-1 and numbers are from 1 to n
        int n = arr.length + 1; // expected range size
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int v : arr) {
            actualSum += v;
        }
        int missing = expectedSum - actualSum;
        if (missing == 0) {
            System.out.println("No missing number in 1.." + n);
        } else {
            System.out.println("Missing number (1.." + n + "): " + missing);
        }

        // all missing numbers in an unsorted array (range determined by min/max)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        boolean[] present = new boolean[max - min + 1];
        for (int v : arr) {
            present[v - min] = true;
        }
        System.out.print("Missing numbers between " + min + " and " + max + ": ");
        boolean foundAny = false;
        for (int i = min; i <= max; i++) {
            if (!present[i - min]) {
                System.out.print(i + " ");
                foundAny = true;
            }
        }
        if (!foundAny) {
            System.out.print("none");
        }
        System.out.println();

    }
}
