//package RECURSION;

import java.util.Scanner;

public class R4 {
    static void m1(int a) {
        if (a == 0) {
            return;
        }
        m1(a - 1);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = sc.nextInt();
        m1(n);

    }

}
