//Create a proper ATM machine program using switch case and also add a beautiful thank you message at the end of the transaction. The program should ask the user to enter their name and pin, and then allow them to perform transactions such as checking balance, withdrawing money, and depositing money. The program should also check for valid input and handle errors gracefully.
//1. to get the user information 
//2. to check the user name and pin for validity
//3. to display the transaction options to the user
//4. to perform transactions using switch case
//5. check the balance before allowing the user to withdraw money and also cross check the pin before allowing the user to perform any transaction
//5. to check for valid input and handle errors gracefully
//4. to display a beautiful thank you message at the end of the transaction.

import java.util.Scanner;

public class ATMSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("welcome to Simple Bank Of India");
        System.out.println("---------------------------------------------------");

        System.out.println("please enter your pin:");
        int pin = sc.nextInt();

        System.out.println("please select the transaction you want to perform:");
        System.out.println("1. check balance");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");

        int transaction = sc.nextInt();
        double balance = 10000.00; // initial balance

        switch (transaction) {
            case 1:
                System.out.println("your current balance is: " + balance);
                break;
            case 2:
                System.out.println("Withdrawing processing...");
                System.out.println("enter the amount you want to withdraw:");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount > balance) {
                    System.out.println("insufficient balance. please try again.");
                    System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
                    System.out.println("----------------------------------------------------");
                } else {
                    System.out.println("please enter your pin to confirm the transaction:");
                    int enteredPin = sc.nextInt();
                    if (enteredPin == pin) {
                        balance -= withdrawAmount;
                        System.out.println("you have withdrawn: " + withdrawAmount);
                        System.out.println("your current balance is: " + balance);
                    } else {
                        System.out.println("invalid pin. transaction failed. please try again.");
                    }
                }
                break;
            case 3:
                System.out.println("Deposit processing...");
                System.out.println("enter the amount you want to deposit:");
                double depositAmount = sc.nextDouble();
                if (depositAmount <= 0.0) {
                    System.out.println("Wrong input amount. please try again.");
                    System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
                    System.out.println("----------------------------------------------------");
                } else {
                    System.out.println("please enter your pin to confirm the transaction:");
                    int enteredPin = sc.nextInt();
                    if (enteredPin == pin) {
                        balance += depositAmount;
                        System.out.println("you have deposited: " + depositAmount);
                        System.out.println("your current balance is: " + balance);
                    } else {
                        System.out.println("invalid pin. transaction failed. please try again.");
                    }
                }
                break;
            case 4:
                System.out.println("you have selected to exit. thank you for using our services.");
                break;
            default:
                System.out.println("Opps! Invalid choice.. Choose again.");
        }
        sc.close();
    }

}
