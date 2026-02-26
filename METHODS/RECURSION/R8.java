//package RECURSION;

import java.util.Scanner;

public class R8 {
    static long m1(int a, int b){
        if(b == 0){
            return 1;
        }
        return a * m1(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base value");
        int a = sc.nextInt();
        System.out.println("enter the exponent value");
        int b = sc.nextInt();
        long result = m1(a, b);
        System.out.println(a + " raised to the power " + b + " is: " + result);
    }
    
}
