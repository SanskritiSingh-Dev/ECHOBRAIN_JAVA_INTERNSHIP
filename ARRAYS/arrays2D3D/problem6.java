//merge all rows into single 1D array
package arrays2D3D;
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] mergedArr = new int[rows*cols];
        int index = 0;
        for(int i = 0; i <rows; i++){
            for(int j = 0; j < cols; j++){
                mergedArr [index] = arr[i][j];
                index++;
            }
        }
        System.out.println("Merged array:");
        for(int i = 0; i < mergedArr.length;i++){
            System.out.print(mergedArr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
    
}
