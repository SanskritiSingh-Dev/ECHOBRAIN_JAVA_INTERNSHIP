/*Neon Number : 
	square of the number is equal to sum of the squared numbers.
	(9-> 9*9=81 -> 8+1 == 9) */
import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range to check the beon number: ");
        int range = sc.nextInt();
        int count = 0;
        for(int i = 1; i<= range; i++){
        //System.out.println("enter the number:");
        //int num = sc.nextInt();
        int num = i;
        int sq = num * num;
        int sum = 0;
        int org = num;
        while(sq > 0){
            int digit = sq % 10;
            sum = sum +digit;
            sq = sq/10;
        }
        if(sum == org){
            count++;
        }
        /*else{
            System.out.println("not a neon number");
        }*/
        }
        System.out.println("total neon numbers are: " + count);
        sc.close();
    }
    
}
