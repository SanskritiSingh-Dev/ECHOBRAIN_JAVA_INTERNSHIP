package WHILE;
import java.util.Scanner;

public class While16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //program to print the power of the number
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the power");
        int p = sc.nextInt();
        int result = 1;
        while(p > 0){
            result = result * n;
            p--;
        }
        System.out.println(result);
        sc.close();
    }
    
}
