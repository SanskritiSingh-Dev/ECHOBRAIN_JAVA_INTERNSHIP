package STRINGS;

import java.util.Scanner;

public class FreqencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int count = 0;
            if(str.indexOf(c) == i){
                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(j) == c){
                        count++;
                    }
                }
                System.out.println(c + " : " + count);
            }
        }
        sc.close();
    }
}
