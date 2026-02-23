//merge jagged array into single 1D array
package arrays2D3D;

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] jArray = new int[3][];
        jArray[0] = new int[3];
        jArray[1] = new int[4];
        jArray[2] = new int[2];
        System.out.println("Enter the elements of the jagged array:");
        for (int i = 0; i < jArray.length; i++) {
            for (int j = 0; j < jArray[i].length; j++) {
                jArray[i][j] = sc.nextInt();
            }
        }
        int totalLen = 0; 
        for(int i = 0; i <jArray.length; i++){
            totalLen = totalLen + jArray[i].length;
        }
        //merge jagged array into single 1D array
        int[] res = new int[totalLen];
        int k = 0; 
        for(int i = 0; i < jArray.length; i++){
            for(int j = 0; j < jArray[i].length; j++){
                res[k] = jArray[i][j];
                k++;
            }
        }
        System.out.println("Merged 1D array:");
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
    
}
