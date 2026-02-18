package WHILE;
import java.util.Scanner;

public class While6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find the reverse of a number 
        System.out.println("enter the n");
        int n = sc.nextInt();
        int rev = 0;
        while( n >= 1){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
