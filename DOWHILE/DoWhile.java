//keep accepting the number and calculate sum until user enters 0
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        do{
            sum = sum +num;
            num = sc.nextInt();
        }while(num !=0);
        if(num == 0){
            System.out.println("you have clicked 0, sum is : " + sum);
        }
        sc.close();
    }
}
