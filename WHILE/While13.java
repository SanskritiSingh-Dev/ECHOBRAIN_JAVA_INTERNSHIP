package WHILE;
import java.util.Scanner;

public class While13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find second smallest digit among the number
        System.out.println("enter the n");
        int n = sc.nextInt();
        int max = 9; 
        int secondMax = 9;
        while( n >= 1){
            int digit = n % 10;
            if(digit < max){
                secondMax = max;
                max = digit;
            } else if (digit < secondMax && digit != max) {
                secondMax = digit;
            }

            n = n/10;
        }
        System.out.println(secondMax);
        sc.close();
    }
    
}
