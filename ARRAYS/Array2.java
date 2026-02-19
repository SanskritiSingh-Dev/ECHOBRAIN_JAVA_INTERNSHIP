//package ARRAYS;
//create an array of size 5 and store numbers.Print all elements
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //print all the elements
        System.out.println("elements are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
