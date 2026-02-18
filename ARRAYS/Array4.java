//package ARRAYS;
//create an array of 6 elements and print the sum of all element
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("enter the elemnts:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum = sum + arr[i];        
        }
        System.out.println("the sum of the elements in the array is: " + sum);
        sc.close();
    }
}
