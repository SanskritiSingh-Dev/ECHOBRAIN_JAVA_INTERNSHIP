//package ARRAYS;
//find the frequency of each element
import java.util.Scanner;
public class Array15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< arr.length; i++){
            int count = 1; 
            for(int j = i+1;j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 1){
                System.out.println("the frequency of " + arr[i] + " is: " + count);
            }
        }
        sc.close();
    }
    
}
