package CUSTOM_EXCEPTION;
/*Write a Java program for a Student Registration System with the following
validations:
Inputs from User:
 Name
 Age
 Marks
 Password

Custom Exceptions to Create:
A. InvalidAgeException
 Throw if age &lt; 18
 Message: Age must be 18 or above

B. InvalidMarksException
 Throw if marks &lt; 0 OR marks &gt; 100
 Message: Marks should be between 0 and 100;

C. InvalidPasswordException
 Throw if password length &lt; 8
 Message: Password must be at least 8 characters;

D. InvalidNameException
 Throw if name is empty or contains digits
 Message: Name should contain only alphabets */

import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {

    public InvalidPasswordException(String message) {
        super(message);
    }
}
class InvalidNameException extends Exception {

    public InvalidNameException(String message) {
        super(message);
    }
}


public class StuRegSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your name:");
            String name = sc.nextLine();
            if (name.isEmpty() || name.matches(".*\\d.*")) {
                throw new InvalidNameException("Name should contain only alphabets.");
            }

            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Enter your marks:");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100.");
            }

            sc.nextLine(); 
            System.out.println("Enter your password:");
            String password = sc.nextLine();
            if (password.length() < 8) {
                throw new InvalidPasswordException("Password must be at least 8 characters long.");
            }

            System.out.println("Registration successful!");

        } catch (InvalidNameException | InvalidAgeException | InvalidMarksException | InvalidPasswordException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
