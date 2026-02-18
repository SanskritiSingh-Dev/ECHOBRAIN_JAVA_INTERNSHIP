import java.util.Scanner;

public class PhoneCharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //check the battery of the phone and print the appropriate message
        System.out.println("enter the battery of your phone");
        int battery = sc.nextInt();
        if(battery <=20){
            System.out.println("Please charge your phone");
        }
        else{
            System.out.println("Your phone is good to go");
        }

        sc.close();
    }
    
}
