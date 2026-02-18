//check if the given number is 3 digit, 2 digit, 1 digit or more than that.

import java.util.Scanner;
public class DigitClassify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num >= 100 && num <= 999) {
            System.out.println(num + " is a 3-digit number.");
        } else if(num >= 10 && num <= 99) {
            System.out.println(num + " is a 2-digit number.");
        } else if(num >= 0 && num <= 9) {
            System.out.println(num + " is a 1-digit number.");
        } else {
            System.out.println(num + " has more than 3 digits.");
        }
        sc.close();

    }
}