//package ARRAYS;
//compare and check the two array without any pre defined function

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        System.out.println("enter the elemnts of 1st array: ");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elemnts of 2nd array: ");
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        boolean compare = true;
        for(int i = 0; i< arr1.length; i++){
            if(arr1[i] != arr2[i]){
                compare = false;
                break;
            }
            else{
                compare = true;
            }
        }
        if(compare == true){
            System.out.println("the arrays are same");
        }
        else{
            System.out.println("the arrays are different");
        }
        sc.close();
    }

    
}
