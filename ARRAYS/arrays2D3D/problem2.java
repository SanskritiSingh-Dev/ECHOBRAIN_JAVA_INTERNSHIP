//package arrays2D3D;
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //jagged array - an array of arrays where each inner array can have different lengths.
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[3];
        //store the data in array
        /*arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;*/
        //using for loop
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the student " + (i+1)+" marks: " );
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] is : arr) {
            for(int ele : is){
                System.out.println(ele);
            }
            System.out.println(); // Print a newline after each inner array
        }
        sc.close();
    }
    
}
