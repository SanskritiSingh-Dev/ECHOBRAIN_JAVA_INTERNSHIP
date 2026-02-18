//write code to build an simple atm machine using only if else conditional statements, also we can use nested if else statements.
//the machine should have the following features:
//1. check the balance
//2. withdraw money
//3. deposit money
//4. exit

//conditions to check is : user name, pin, entered amount cross check. 
// at last if they want the bill or not.
// A beautiful thank you message at the end of the transaction.

import java.util.Scanner;
public class AtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ask to enter the user name and pin
        System.out.println("---------------------------------------------------");
        System.out.println("welcome to Simple Bank Of India");
        System.out.println("---------------------------------------------------");
        System.out.println("please enter your user name:");
        String userName = sc.next();
        System.out.println("please enter your pin:");
        int pin = sc.nextInt();
        //check the user name size which should be at least 5 characters and pin should be 4 digits
        if(userName.length() >= 5 && pin >=1000 && pin <=9999){
            System.out.println("welcome " + userName + " to Simple Bank Of India");
            System.out.println("please select the transaction you want to perform:");
            System.out.println("1. check balance");
            System.out.println("2. withdraw money");
            System.out.println("3. deposit money");
            System.out.println("4. exit");
            int transaction = sc.nextInt();
            double balance = 10000.00; //initial balance
            if(transaction == 1){
                System.out.println("your current balance is: " + balance);
            }
            else if(transaction == 2){
                System.out.println("enter the amount you want to withdraw:");
                double withdrawAmount = sc.nextDouble();
                if(withdrawAmount > balance){
                    System.out.println("insufficient balance. please try again.");
                    System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
                    System.out.println("----------------------------------------------------");
                }
                else{
                    //enter the pin, cross check it and then allow the user to withdraw the money
                    System.out.println("please enter your pin to confirm the transaction:");
                    int enteredPin = sc.nextInt();
                    if(enteredPin != pin){
                        System.out.println("invalid pin. transaction failed. please try again.");
                    }
                    else{
                        balance -= withdrawAmount;
                        System.out.println("you have withdrawn: " + withdrawAmount);
                        System.out.println("your current balance is: " + balance);
                        System.out.println("do you want the bill? (yes/no)");
                        String bill = sc.next();
                        if(bill.equalsIgnoreCase("yes")){
                            System.out.println("your bill is generated.");
                        }
                        else{
                            System.out.println("you have selected not to print the bill.");
                        }
                    }
                    System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
                    System.out.println("---------------------------------------------------");
                }
            }
            else if(transaction == 3){
                //enter the pin, cross check then allow the transaction
                System.out.println("please enter your pin to confirm the transaction:");
                int enteredPin = sc.nextInt();
                if(enteredPin != pin){
                    System.out.println("invalid pin. transaction failed. please try again.");
                    System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
                    System.out.println("---------------------------------------------------");
                }
                else{
                    System.out.println("enter the amount you want to deposit:");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    System.out.println("you have deposited: " + depositAmount);
                    System.out.println("your current balance is: " + balance);
                    System.out.println("do you want the bill? (yes/no)");
                    String bill = sc.next();
                    if(bill.equalsIgnoreCase("yes")){
                        System.out.println("your bill is generated.");
                    }
                    else{
                        System.out.println("you have selected not to print the bill.");
                    }
                }
                System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
                System.out.println("---------------------------------------------------");
            }
            else if(transaction == 4){
                System.out.println("you have selected to exit. thank you for using our services.");
            }
            else{
                System.out.println("please select a valid transaction. \n Try Again !!");
            }
        } 
        else{
            System.out.println("invalid username must be more than 5 characters and Pin must be 4 digits. please try again.");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Thank You for using Simple Bank Of India. Have a nice day!");
        System.out.println("---------------------------------------------------");
        sc.close();  
    }
    
}
