package WHILE;
import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print n to 1 numbers
        System.out.println("enter the n");
        int n = sc.nextInt();
        while( n >= 1){
            System.out.println(n);
            n--;
        }
        
    }
}

