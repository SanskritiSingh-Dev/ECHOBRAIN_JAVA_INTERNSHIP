package CUSTOM_EXCEPTION;

/*Student Grade System

Create InvalidGradeException
 Accept marks
 Throw exception if marks &lt; 0 or &gt; 100
 Print grade if valid */

import java.util.Scanner;

class InvalidGradeException extends Exception {

    public InvalidGradeException(String message) {
        super(message);
    }
}
public class StuGradeSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter student marks:");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new InvalidGradeException("Invalid marks. Please enter marks between 0 and 100.");
            } else {
                System.out.println("Valid marks entered: " + marks);
            }
        } catch (InvalidGradeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
