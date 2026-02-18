//keep asking user to enter the password until correct password is matched
import java.util.Scanner;
public class DoWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "abc123";
        String input;
        do {
            System.out.println("enter the password: ");
            input = sc.nextLine();
            if(input.equals(password)){
                System.out.println("password matched, access granted");
            }
            else{
                System.out.println("incorrect password, try again");
            }
        } while (!input.equals(password));
        sc.close();
    }
    
}
