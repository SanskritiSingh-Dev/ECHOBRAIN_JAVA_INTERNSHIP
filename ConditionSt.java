import java.util.Scanner;

public class ConditionSt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //multiplied number is even or odd
        System.out.println("Enter a number: ");
        int userNum = sc.nextInt();
        
        if(userNum %2 ==0){
            int finalNum = userNum*5;
            System.out.println("The number is even, hence multiplied number is: " + finalNum);
        }else{
            System.out.println("odd number, so no need to multiply");
        }

        System.out.println("---------------------------------------------");

        //check the time and print the appropriate message
        System.out.println("enter the time in 24hr format:");
        int time = sc.nextInt();
        if(time < 12){
            System.out.println("Good Morning");
        }
        else if(time <18){
            System.out.println("Good Afternoon");
        }
        else{
            System.out.println("Good Evening");
        }
        System.out.println("--------------------------------------------------------");

        //check the temperature outside and print the appropriate message
        System.out.println("enter the temperature outside: ");
        double temp = sc.nextDouble();
        if(temp >=45){
            System.out.println("Oh god!! It's too hot outside. Please stay hydrated and avoid going out.");
        }

        //check whether the given number is divisible by three or not
        System.out.println("Enter the number:");
        int CheckNum = sc.nextInt();
        if(CheckNum % 3 == 0){
            System.out.println("the number is divisble by 3");
        }
        else{
            System.out.println("the number is not divisible by 3");
        }

        System.out.println("-----------------------------------------------");

        //print a message if the number is a 3 digit number
        System.out.println("enter the number:");
        int Number = sc. nextInt();
        if(Number >=100 && Number <==999){
            System.out.println("the number is a 3 digit number");
        }
        else{
            System.out.println("the number is not a 3 digit number");
        }

        System.out.println("-----------------------------------------------");

        //write a program to check if the given char is digit or not
        System.out.println("enter the character:");
        char character1 = sc.next();
        if(character1 >= '0' && character1 <= '9'){
            System.out.println("the character is a digit");
        }
        else{
            System.out.println("the character is not a digit");
        }
    }
    sc.close();
}