package INTERVIEW_QUESTIONS;

import java.util.Scanner;

//Write a program to find the second largest element in an array without sorting.
//Write a program to find the second smallest element in an array.
public class Small_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int val : arr) {
            // update max and second max
            if (val > max) {
                secMax = max;
                max = val;
            } else if (val > secMax && val != max) {
                secMax = val;
            }

            // update min and second min
            if (val < min) {
                secMin = min;
                min = val;
            } else if (val < secMin && val != min) {
                secMin = val;
            }
        }

        System.out.println("Maximum element: " + max);
        if (secMax != Integer.MIN_VALUE) {
            System.out.println("Second maximum element: " + secMax);
        } else {
            System.out.println("Second maximum element does not exist.");
        }

        System.out.println("Minimum element: " + min);
        if (secMin != Integer.MAX_VALUE) {
            System.out.println("Second minimum element: " + secMin);
        } else {
            System.out.println("Second minimum element does not exist.");
        }

        sc.close();

    }
}
