//Write a program to find the frequency of each element in an array.
//Write a program to find the first repeating element in an array.
package INTERVIEW_QUESTIONS;

import java.util.Scanner;

class Freq_RepeatingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        //store the data in array
        System.out.println("enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // frequency of each element
        boolean[] visited = new boolean[arr.length];
        System.out.println("Element frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }

        // find first repeating element
        int firstRepeating = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    firstRepeating = arr[i];
                    break;
                }
            }
            if (firstRepeating != Integer.MIN_VALUE) {
                break;
            }
        }
        if (firstRepeating != Integer.MIN_VALUE) {
            System.out.println("First repeating element: " + firstRepeating);
        } else {
            System.out.println("No repeating elements found.");
        }

        sc.close();
    }

    
}