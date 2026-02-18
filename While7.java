import java.util.Scanner;

public class While7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //palindrome or not
        System.out.println("enter the n");
        int n = sc.nextInt();
        int reverse = 0;
        int org = n;
        while( n >= 1){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        if(reverse == org){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not palindrome");
        }
        sc.close();
    }
    
}
