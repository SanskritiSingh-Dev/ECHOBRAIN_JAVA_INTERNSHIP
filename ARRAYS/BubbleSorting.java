//sorting of array uing bubble sort
//time complexity is O(n^2) and space complexity is O(1)
import java.util.Scanner;
public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        //store the data
        System.out.println("enter the elements: ");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //bubble sorting techique
        for(int i = 0; i < arr.length-1; i++){//outer loop for numbers
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
        //print the array
        System.out.println("sorted element is : ");
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();

    }
    
}
