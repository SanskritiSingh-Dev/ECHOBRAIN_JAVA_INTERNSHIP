//package ARRAYS;
//copy the elements from one array to another without using predefined function
import java.util.Scanner;
public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        System.out.println("enter the elements:" );
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        //copying the element
        for(int i = 0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("the 2nd array is: ");
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        sc.close();
    }
    
}
