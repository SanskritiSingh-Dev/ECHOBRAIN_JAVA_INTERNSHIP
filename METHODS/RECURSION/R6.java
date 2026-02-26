//package RECURSION;

import java.util.Scanner;

public class R6 {
    static int m1(int a){
        if(a == 0){
            return 0;
        }
        return a + m1(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        int result = m1(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);
    }
    
}
