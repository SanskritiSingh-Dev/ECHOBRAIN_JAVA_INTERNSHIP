//package RECURSION;

import java.util.Scanner;

public class R9 {
    static int m1(int n){
        if(n < 10){
            return 1;
        }
        return 1 + m1(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        int count = m1(n);
        System.out.println("Number of digits in " + n + " is: " + count);
    }
    
}
