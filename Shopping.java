import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if the transaction amount is above Rs. 5000 display "otp required" else "transaction successful"
        System.out.println("enter the transaction amount:");
        int amount = sc.nextInt();
        if(amount > 5000){
            System.out.println("otp required");
        }
        else{
            System.out.println("transaction successful");
        }

        System.out.println("-----------------------------------------------");

        //in an online shoping cart, ifitem count is zero print "oopsyour cart is empty" else print"proceed to checkout"
        System.out.println("enter the item count:");
        int itemCount = sc.nextInt();
        if(itemCount == 0){
           System.out.println("oops!! your cart is empty");
        }
        else{
           System.out.println("proceed to checkout");
        }
        sc.close();
    }
    
}
