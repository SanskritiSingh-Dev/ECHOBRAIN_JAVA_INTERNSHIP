package WHILE;
import java.util.Scanner;
public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print 1 to n numbers
        System.out.println("enter the n");
        int n = sc.nextInt();
        int start = 1;
        while( start <=n){
            System.out.println(start);
            start++;
        }
        
    }
}
