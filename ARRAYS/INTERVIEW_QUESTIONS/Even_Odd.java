package INTERVIEW_QUESTIONS;
//Write a program to count the number of even and odd elements in an array.

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //even count
        int evenCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount ++;
            }
        }
        System.out.println("the count of even number is : " + evenCount);

        //odd count
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                oddCount ++;
            }
        }
        System.out.println("the count of odd number is : " + oddCount);
        sc.close();

    }
}
