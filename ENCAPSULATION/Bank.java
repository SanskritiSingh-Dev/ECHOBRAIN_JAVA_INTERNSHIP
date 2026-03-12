class BankAccount {
    //private var
    private double balance;

    //setter 
    public void setBalance(double balance){
        this.balance = balance;
    }
    //getter
    public double getBalance(){
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.setBalance(5000);
        System.out.println("Balance: "+ ac.getBalance());
    }
}