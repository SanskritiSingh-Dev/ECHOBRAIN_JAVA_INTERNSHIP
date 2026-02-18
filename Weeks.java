//to display day of week based on numbers(1 to 7) using if else statements

import java.util.Scanner;

public class Weeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 to 7:");
        int dayNum = sc.nextInt();
        if(dayNum == 1){
            System.out.println("the day is Monday");
        }
        else if(dayNum == 2){
            System.out.println("the day is Tuesday");
        }
        else if(dayNum == 3){
            System.out.println("the day is Wednesday");
        }
        else if(dayNum == 4){
            System.out.println("the day is Thursday");
        }
        else if(dayNum == 5){
            System.out.println("the day is Friday");
        }
        else if(dayNum == 6){
            System.out.println("the day is Saturday");
        }
        else if(dayNum == 7){
            System.out.println("the day is Sunday");
        }
        else{
            System.out.println("please enter a valid number between 1 to 7");
        }
        sc.close();
    }
    
}
