package CUSTOM_EXCEPTION;

/*Invalid Password Exception
Createa custom exception InvalidPasswordException and take password from
scanner
 Password must be at least 8 characters
 Throw exception if invalid */
import java.util.Scanner;

class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class InvalidPwException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your password:");
            String password = sc.nextLine();
            if (password.length() < 8) {
                throw new InvalidPasswordException("Password must be at least 8 characters long.");
            } else {
                System.out.println("Password is valid.");
            }
        } catch (InvalidPasswordException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}
