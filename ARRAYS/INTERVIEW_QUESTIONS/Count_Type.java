package INTERVIEW_QUESTIONS;

import java.util.Scanner;

//Write a program to count positive, negative, and zero elements in an array.
public class Count_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //count positive
        int positiveCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positiveCount++;
            }
        }
        System.out.println("Positve count is " + positiveCount);
        //count negitive
        int negitiveCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                negitiveCount++;
            }
        }
        System.out.println("Negitive count is " + negitiveCount);
        //count zero
        int zeroCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
        }
        System.out.println("Zero count is " + zeroCount);
        sc.close();
    }
}
