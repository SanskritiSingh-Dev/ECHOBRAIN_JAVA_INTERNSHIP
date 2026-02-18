import java.util.Scanner;

public class While9 {
    //find the sum of even digit in the number
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the n");
        int n = sc.nextInt();
        int sum = 0;
        while( n >= 1){
            int digit = n % 10;
            if(digit % 2 == 0){
                sum = sum + digit;
            }
            n = n/10;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
