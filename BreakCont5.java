import java.util.Scanner;
public class BreakCont5 {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        else{
            for(int i = 2; i<= num/2; i++){
                if(num % i == 0){
                    return false;
                }
                else{
                    continue;
                }
            }
            return true;
        }
    }

    //print number from 2 to 100,  skip non prime numbers using continue, stop when firsst prime preater than 50 is found
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean foundPrime = false;
        System.out.println("Prime numbers from 2 to 100:");
        for(int i = 2; i <= 100; i++){
            if(i > 50 && isPrime(i)){
                System.out.println("1st prime number greater than 50 is : " + i);
                break;
            }
            else{
                if(isPrime(i)){
                    System.out.println(i);
                }
                else{
                    continue;
                }
            }
        }
        sc.close();
    }
}
