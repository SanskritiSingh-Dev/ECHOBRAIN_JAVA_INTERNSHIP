package INTERVIEW_QUESTIONS;

import java.util.Scanner;

//Write a program to find the first non-repeating element in an array.
public class First_NonRepNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // find first non repeating element
        int firstNonRepeating = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            boolean repeating = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeating = true;
                    break;
                }
            }
            if (!repeating) {
                firstNonRepeating = arr[i];
                break;
            }
        }
        if (firstNonRepeating != Integer.MIN_VALUE) {
            System.out.println("First non repeating element: " + firstNonRepeating);
        } else {
            System.out.println("No non repeating element found.");
        }

        sc.close();
    }
}
