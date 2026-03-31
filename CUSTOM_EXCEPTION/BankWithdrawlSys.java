package CUSTOM_EXCEPTION;

/*Bank Withdrawal System
Create InsufficientBalanceException
 Balance = 5000
 Ask withdrawal amount to user through scanner
 Throw exception if amount &gt; balance */

import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class BankWithdrawlSys {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter withdrawal amount:");
            int amount = sc.nextInt();
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance. Your current balance is: " + balance);
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
