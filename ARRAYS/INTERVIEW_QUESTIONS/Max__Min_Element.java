package INTERVIEW_QUESTIONS;
import java.util.Scanner;
//Write a program to find the maximum element in a given array of integers.
//Write a program to find the minimum element in a given array of integers.
public class Max__Min_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //max of element
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        //min of elements
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);

    }

}