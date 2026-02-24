import java.util.Scanner;

public class Method7 {
    public static boolean EvenOdd(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        boolean res = EvenOdd(n);
        System.out.println("the given number is even or not? : " + res);

    }
}
