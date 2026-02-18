//package ARRAYS;
//create an array and replace all negitive value with zero
import java.util.Scanner;
public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elemnets: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println("array after changes: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
    
}
