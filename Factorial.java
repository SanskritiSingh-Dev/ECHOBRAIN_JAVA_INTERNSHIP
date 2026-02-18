import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr how many factorial u want:");
        int fact = 1;
        int n = sc. nextInt();
        if(n == 0 || n == 1){
            System.out.println("the factorial is 1.");
        }
        else if(n == 2 ){
            System.out.println("the factorial is 2");
        }
        else{
            for(int i =1; i<n; i++){
                fact = fact*i;
            }
            System.out.println("The factorial is : " + fact);
        }
        sc.close();

    }
}
