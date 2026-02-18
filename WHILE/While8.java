package WHILE;
import java.util.Scanner;

public class While8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find product of digit 
        System.out.println("enter the n");
        int n = sc.nextInt();
        int product = 1;
        while( n >= 1){
            int digit = n % 10;
            product = product* digit;
            n = n/10;
        }
        System.out.println(product);
        sc.close();
    }
    
}
