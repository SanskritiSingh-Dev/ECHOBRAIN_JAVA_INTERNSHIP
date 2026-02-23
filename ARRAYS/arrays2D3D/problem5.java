//print jagged array in reverse row order only
//package arrays2D3D;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //jagged array
        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];
        jaggedArray[3] = new int[5];
        //input the values
        for(int i = 0; i < jaggedArray.length; i++){
            System.out.println("enter the values for row " + i);
            for(int j = 0; j < jaggedArray[i].length; j++){
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        //printing the elements in reverse row order
        System.out.println("the elements in the jagged array in reverse row order are:");
        for(int i = 0; i < jaggedArray.length; i++){
            int rowIndex = jaggedArray.length - 1 - i; // Calculate the index for reverse order
            for(int j = 0; j < jaggedArray[rowIndex].length; j++){
                System.out.println(jaggedArray[rowIndex][j]);
            }
            System.out.println(); // Print a newline after each row 
        }
        sc.close();

    }

    
}
