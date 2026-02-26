//package RECURSION;

import java.util.Scanner;

public class R7 {
    static long m1(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        return a * m1(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        long result = m1(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
}
