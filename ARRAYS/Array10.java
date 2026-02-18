//package ARRAYS;
//shift all element tof array to left position without using left shif operator
import java.util.Scanner;
public class Array10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
        System.out.println("enter the elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println("the array after shifting is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
