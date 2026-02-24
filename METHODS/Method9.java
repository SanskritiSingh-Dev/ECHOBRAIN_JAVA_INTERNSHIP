import java.util.Scanner;

public class Method9 {
    public static void ReverseOfNum(int num){
        int rev = 0;
        while(num >0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number is: " + rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        ReverseOfNum(num);
    }
}
