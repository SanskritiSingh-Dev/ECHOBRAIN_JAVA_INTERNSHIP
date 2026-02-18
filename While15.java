import java.util.Scanner;

public class While15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find largest even number among the digit
        System.out.println("enter the n");
        int n = sc.nextInt();
        int max = 0;
        while( n >= 1){
            int digit = n % 10;
            if(digit % 2 == 0 && digit > max){
                max = digit;
            }

            n = n/10;
        }
        System.out.println(max);
        sc.close();
    }
    
}
