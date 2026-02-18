//package ARRAYS;
//move all the zeros to end while maintaing the order
import java.util.Scanner;
public class Array14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        //fill the remaining element with zero
        for(int i = count; i < arr.length; i++){
            arr[i] = 0;
        }
        //print the array after changes
        System.out.println("array after changes: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
    
}
