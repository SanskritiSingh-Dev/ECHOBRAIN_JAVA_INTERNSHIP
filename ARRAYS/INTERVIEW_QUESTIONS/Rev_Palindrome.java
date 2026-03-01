package INTERVIEW_QUESTIONS;

import java.util.Scanner;

//Write a program to reverse an array in place without using another array.
//Write a program to check whether a given array is a palindrome.
public class Rev_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // reverse array in place
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        System.out.println("Reversed array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // check palindrome
        boolean isPalindrome = true;
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] != arr[right]){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if(isPalindrome){
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
        
        sc.close();

    }
}

