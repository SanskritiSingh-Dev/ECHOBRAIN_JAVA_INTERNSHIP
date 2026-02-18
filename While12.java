import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find second largest digit among the number
        System.out.println("enter the n");
        int n = sc.nextInt();
        int max = 0;
        int secondMax = 0;
        while( n >= 1){
            int digit = n % 10;
            if(digit > max){
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
            n = n/10;  
        }
        System.out.println("Second max number: " + secondMax);
        System.out.println("first max number is: " +max);
        sc.close();
    }
    
}
