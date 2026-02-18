import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number you want to check: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 2){
            System.out.println("Prime no.");
        }
        else{
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime =false;
                }
            }
            if (isPrime == true){
                System.out.println("Prime no.");
            }
            else{
                System.out.println("Not a Prime");
            }
        }
        sc.close();
    }
    
}