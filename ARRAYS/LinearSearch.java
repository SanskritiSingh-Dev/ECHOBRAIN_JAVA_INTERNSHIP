import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be searched: ");
        int key = sc.nextInt();
        //linear search
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("element found at index: " + i);
                return;
            }
        }
        System.out.println("element not found in the array");
        sc.close();
    }
}
