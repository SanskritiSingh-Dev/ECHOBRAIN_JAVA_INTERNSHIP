package CUSTOM_EXCEPTION;
/* Login System
Create InvalidCredentialsException
 Predefined username &amp; password
 Throw exception if login fails*/

import java.util.Scanner;

class InvalidCredentialsException extends Exception {

    public InvalidCredentialsException(String message) {
        super(message);
    }
}
public class LoginSys {
    public static void main(String[] args) {
        String username = "poppy";
        String password = "passcode123";
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter username:");
            String inputUsername = sc.nextLine();
            System.out.println("Enter password:");
            String inputPassword = sc.nextLine();
            if (!inputUsername.equals(username) || !inputPassword.equals(password)) {
                throw new InvalidCredentialsException("Invalid username or password.");
            } else {
                System.out.println("Login successful.");
            }
        } catch (InvalidCredentialsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
