package arrays2D3D;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements: ");
        //store the data
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //print the data
        System.out.println("the elements are: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j <arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
        //reverse the data
        System.out.println("reverse the elements are: ");
        for(int i = arr.length -1; i >=0; i--){
            for(int j = arr[i].length -1; j >=0; j--){
                System.out.println(arr[i][j]);
            }
        }
        sc.close();
    }
}