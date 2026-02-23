//create a jagged arrat with 3 row  having izes 2,3,4. print all elemnts
//package arrays2D3D;
import java.util.Arrays;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];
        //input the values
        for(int i = 0; i < jaggedArray.length; i++){
            System.out.println("enter the values for row " + i);
            for(int j = 0; j < jaggedArray[i].length; j++){
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        //printing the elements
        System.out.println("the elements in the jagged array are:");
        for (int[] is : jaggedArray) {
            for(int ele : is){
                System.out.println(ele);
            }
            System.out.println(); // Print a newline after each row
        }
        sc.close();
    }
    
}
