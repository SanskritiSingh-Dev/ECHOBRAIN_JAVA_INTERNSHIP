package WHILE;
import java.util.Scanner;

public class While4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find sum of digit 
        System.out.println("enter the n");
        int n = sc.nextInt();
        int count = 0;
        while( n >= 1){
            int digit = n % 10;
            count++;
            n = n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
