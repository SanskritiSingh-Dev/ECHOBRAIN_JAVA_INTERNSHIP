package WHILE;
import java.util.Scanner;
public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find sum of digit 
        System.out.println("enter the n");
        int n = sc.nextInt();
        int sum = 0;
        while( n >= 1){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println(sum);
        
    }
}
