package CUSTOM_EXCEPTION;

/* Multiple Validations : Create a program with:

 Age validation
 Salary validation
 Password validation

Use different custom exceptions for each case*/

import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class MultiValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18.");
            }

            System.out.println("Enter your salary:");
            double salary = sc.nextDouble();
            if (salary < 30000) {
                throw new InvalidSalaryException("Salary must be at least 30000.");
            }

            sc.nextLine(); 
            System.out.println("Enter your password:");
            String password = sc.nextLine();
            if (password.length() < 8) {
                throw new InvalidPasswordException("Password must be at least 8 characters long.");
            }

            System.out.println("All validations passed successfully.");

        } catch (InvalidAgeException | InvalidSalaryException | InvalidPasswordException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
    
}
