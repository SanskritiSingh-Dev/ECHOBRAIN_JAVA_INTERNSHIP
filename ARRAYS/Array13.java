//package ARRAYS;
//reverse an array without another array
import java.util.Scanner;
public class Array13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //reverse the array
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1 -i];
            arr[arr.length-1 -i] = temp; 
        }
        System.out.println("the array in reverse order is: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
