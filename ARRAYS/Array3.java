//package ARRAYS;
//store 5 numbers from user and pint it in reverse order
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("elemnets in reverse order is: ");
        for(int i = arr.length -1; i>= 0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
        
    }
}
