//selection sort
//time complexity is O(n^2) and space complexity is O(1)

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //selection sort
        for(int i = 0; i < arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
