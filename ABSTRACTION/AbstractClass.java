/*Abstraction is the process of hiding implementation details and showing only the functionality to the user. In Java, abstraction is achieved using abstract classes and interfaces. */

package ABSTRACTION;
abstract class ATM{
    //abstract method(no body)
    abstract void withdraw();
    abstract void checkBalance();

    //concrete method(must be executed)
    void display(){
        System.out.println("Welcome to ATM");
    }
}

class BankATM extends ATM {
    void withdraw(){
        System.out.println("Money withdraw successfully.");
    }
    void checkBalance() {
        System.out.println("your balance is 50000");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        ATM atm = new BankATM(); //upcasting
        atm.display();
        atm.withdraw();
        atm.checkBalance();
    }
}