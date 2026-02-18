import java.util.Scanner;
public class Harshad {
    //HArshad number is a number that is divisible by the sum of its digits.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int org = num;
        while(num > 0){
            int digit = num % 10;
            sum =sum + digit;
            num = num/10;
        }
        if(org % sum ==0){
            System.out.println("harshad number" );
        }else{
            System.out.println("not harshad number");
        }
        sc.close();
    }
    
}
