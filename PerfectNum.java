import java.util.Scanner;

public class PerfectNum {
    // A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < num; i++){
            if(num % i ==0){
                sum = sum + i;

            }
        }
        if(sum == num){
            System.out.println("perfect number");
        }else{
            System.out.println("not perfect number");
        }
        sc.close();
        
    }
    
}
