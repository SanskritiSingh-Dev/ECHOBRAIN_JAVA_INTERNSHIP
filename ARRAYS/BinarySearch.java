//binary search in an array
//time complexity is O(log n) and space complexity is O(1)

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("enter the elements in sorted order: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
         System.out.println("enter the element to be searched: ");
        int key = sc.nextInt();
        //binary search
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start +(end -start) / 2;
            if(arr[mid] == key){
                System.out.println("element found at index: " + mid);
                return;
            }
            else if(arr[mid] > key){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println("element not found in the array");
        sc.close();
    }
}
