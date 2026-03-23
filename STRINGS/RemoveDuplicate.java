package STRINGS;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String res = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(res.indexOf(c) == -1){
                res = res + c;
            }
        }
        System.out.println("final string is : " + res);
        sc.close();
    }
}
