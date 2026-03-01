package INTERVIEW_QUESTIONS;

import java.util.Scanner;

//Write a program to calculate the sum and average of elements in an array.
public class Sum_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //sum
        int sum = 0;
        for(int i =0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        float avg = sum / arr.length;
        System.out.println("sum of elements is " + sum);
        System.out.println("average of numbers is " + avg);
        sc.close();


    }
    
}
