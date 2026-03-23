package STRINGS;

import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        boolean found = false;

        for(int i= 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("non repeating char is : " + ch);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("no non repeating char found");
        }
        sc.close();
    }
}
