
import java.util.Scanner;
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num /= 10;
        }
        System.out.println("sum of digits: " + sum);
        System.out.println("product of digits: " + product);
        if(sum == product){
            System.out.println("spy number");
        }else{
            System.out.println("not spy number");
        }
    }
    
}
