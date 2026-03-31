package CUSTOM_EXCEPTION;

/*ATM PIN Validation
Create InvalidPinException
 PIN must be 4 digits
 Throw exception if invalid */

import java.util.Scanner;

class InvalidPinException extends Exception {

    public InvalidPinException(String message) {
        super(message);
    }
}
public class ATMPinValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your ATM PIN:");
            String pin = sc.nextLine();
            if (pin.length() != 4 || !pin.matches("\\d{4}")) {
                throw new InvalidPinException("Invalid PIN. PIN must be exactly 4 digits.");
            } else {
                System.out.println("PIN is valid.");
            }
        } catch (InvalidPinException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    
}
