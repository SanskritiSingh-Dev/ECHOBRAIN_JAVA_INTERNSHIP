import java.util.Scanner;

public class While10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find factorial
        System.out.println("enter the n");
        int n = sc.nextInt();
        int fact = 1;
        while( n >= 1){
            fact = fact * n;
            n = n-1;
        }
        System.out.println(fact);
        sc.close();
    }
    
}
