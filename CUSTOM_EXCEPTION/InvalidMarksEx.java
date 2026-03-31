package CUSTOM_EXCEPTION;

/*Invalid Marks Exception
Create InvalidMarksException
 Marks should be between 0 and 100
 Throw exception if invalid */

import java.util.Scanner;
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}
public class InvalidMarksEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your marks:");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100.");
            } else {
                System.out.println("Marks are valid.");
            }
        } catch (InvalidMarksException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    
}
