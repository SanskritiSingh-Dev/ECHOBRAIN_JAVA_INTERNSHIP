//keep asking user to enter positibe number until valid inpu is given
import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter the positive number: ");
            num = sc.nextInt();
            if(num < 0){
                System.out.println("invalid input, please enter a positive number");
            }
            else{
                System.out.println("you have entered a valid number: " + num);
            }
            num = sc.nextInt();
        } while (num != 0);
        sc.close();
    }

}
