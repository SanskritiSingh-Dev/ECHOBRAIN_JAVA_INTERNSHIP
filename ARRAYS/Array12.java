//package ARRAYS;
//check if array is having duplicate number or not
import java.util.Scanner;
public class Array12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elemnets: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean isDuplicate = false;
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
        }
        if(isDuplicate){
            System.out.println("array is having duplicate numbers");
        }
        else{
            System.out.println("array is not having duplicate numbers");
        }
        sc.close();
    }
    
}
