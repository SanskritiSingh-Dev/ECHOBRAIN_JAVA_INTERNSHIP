package CUSTOM_EXCEPTION;

import java.util.Scanner;

/*Invalid Age Exception
Create a custom exception InvalidAgeException and check age
 Throw exception if age &lt; 18
 Otherwise print &quot;Eligible to vote&quot; */

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);

    }
}

public class InvalidAgeExceptionEg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt(); 

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be at least 18");
            }
            System.out.println("Eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
