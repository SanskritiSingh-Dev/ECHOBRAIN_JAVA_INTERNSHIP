package WHILE;
import java.util.Scanner;

public class While18 {
    //find the GCD of two numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println(a);
        sc.close();
    }

    
}
