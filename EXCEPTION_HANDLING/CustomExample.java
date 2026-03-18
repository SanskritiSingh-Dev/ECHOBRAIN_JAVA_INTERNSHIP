package EXCEPTION_HANDLING;
//user tries to withdraw more money than the balance

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
public class CustomExample {
    public static void main(String[] args) {
        int balance = 50000;
        int withdraw = 60000;
        try {
            if(withdraw > balance){
                throw new InsufficientBalanceException("not enough balance");
            }
            balance = balance - withdraw;
            System.out.println("withdrawal successful");
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
