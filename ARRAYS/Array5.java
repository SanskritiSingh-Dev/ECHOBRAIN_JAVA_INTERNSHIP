//package ARRAYS;
//find the first largest and second largest element in the array
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("enter the elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secLargest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > largest && arr[i] != secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println("the largest element in the array is: " + largest);

        System.out.println("the second largest element in the array is: " + secLargest);
        sc.close();
    }
    
}
