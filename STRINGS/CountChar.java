package STRINGS;

import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();

        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                lowerCount++;
            }
            else if(Character.isUpperCase(c)){
                upperCount++;
            }   
            else if(Character.isDigit(c)){
                digitCount++;
            }
        }
        System.out.println("Lowe case count is : " + lowerCount);
        System.out.println("Upper case count is : " + upperCount);
        System.out.println("Digit count is : " + digitCount);
        sc.close();
    }

}
