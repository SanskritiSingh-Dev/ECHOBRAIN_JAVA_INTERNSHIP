//package ARRAYS;
//remove all negitive number form the array and print the new array

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elemnets: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 0){
                count++;
            }
        }
        int newArr[] = new int[arr.length-count];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println("array after removing negitive numbers: ");
        for(int i = 0; i< newArr.length; i++){
            System.out.println(newArr[i]);
        }
        sc.close();
        
    
    }
    
}
