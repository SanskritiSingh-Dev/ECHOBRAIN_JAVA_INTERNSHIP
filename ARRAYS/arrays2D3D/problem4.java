//package arrays2D3D;
//initilize a jagged array using direct values and display it.
import java.util.Arrays;
public class problem4 {
    public static void main(String[] args) {
        //jagged array
        int[][] jarr = {{1,2},{10,20,30},{41,51,61,71}};
        System.out.println("the elements in the jagged array are:");
        for (int[] is : jarr) {
            for(int ele : is){
                System.out.println(ele);
            }
            System.out.println(); // Print a newline after each row
            
        }
    }
    
}
