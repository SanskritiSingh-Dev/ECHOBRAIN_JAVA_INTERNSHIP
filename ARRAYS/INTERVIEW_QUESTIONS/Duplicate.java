package INTERVIEW_QUESTIONS;

import java.util.Scanner;

//Write a program to remove duplicate elements from an array.
//Write a program to print all duplicate elements in an array.
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // print duplicate values
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; 
                }
            }
        }
        System.out.println();

        // remove duplicate values 
        int[] unique = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDup = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                    break;
                }
            }
            if (!isDup) {
                unique[k++] = arr[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}
