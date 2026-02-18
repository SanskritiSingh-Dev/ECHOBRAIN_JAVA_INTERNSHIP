//package ARRAYS;
//merge 2 arrays into new array
import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int finalArr[] = new int[10];
        System.out.println("enter the elements of 1st array: ");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the elements of 2nd array: ");
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        //merging the arrays
        int k = 0;
        for(int i = 0; i<arr1.length; i++){
            finalArr[k] = arr1[i];
            k++;

        }
        for(int i = 0; i<arr2.length; i++){
            finalArr[k] = arr2[i];
            k++;

        }
        System.out.println("the merged array is: ");
        for(int i = 0; i<finalArr.length; i++){
            System.out.println(finalArr[i]);
        }
        sc.close();
    }
    
}
