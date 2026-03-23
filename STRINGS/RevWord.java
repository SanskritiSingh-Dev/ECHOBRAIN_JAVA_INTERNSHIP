package STRINGS;

import java.util.Scanner;

public class RevWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentance");
        String str = sc.nextLine();
        //storing in array
        String[] arr = str.split(" ");
        for(String s : arr){
            String reverse = "";
            for(int i = s.length()-1; i >=0; i--){
                reverse = reverse + s.charAt(i);
            }
            System.out.print(reverse + " ");
        }
    }
}
