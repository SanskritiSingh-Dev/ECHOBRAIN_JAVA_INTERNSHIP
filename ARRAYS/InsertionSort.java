import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //insertion sort
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];//current element
            int prev = i-1;
            //finding out the position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Sorted array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
