package BREAK_CONT;
import java.util.Scanner;

public class BreakCont3 {
    //check prime number using break keyword only, ask user to enter a number and check if it's prime or not, stop the loop when you find the first divisor of the number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if(num <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    System.out.println(num + " is not a prime number. Divisor found: " + i);
                    break;
                }
            }
        }
        if(isPrime) {
            System.out.println(num + " is a prime number.");
        }
        sc.close();
    }

}
