import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*based on age, classify
        0-12: child
        13-19: teenager
        20-59: adult
        60 and above: senior citizen
        */
       System.out.println("enter the age:");
       int age = sc.nextInt();
       if(age >=0 && age <=12){
           System.out.println("the person is a child");
       }
       else if(age >=13 && age <=19){
           System.out.println("the person is a teenager");
       }
       else if(age >=20 && age <=59){
           System.out.println("the person is an adult");
       }
       else if(age >=60){
           System.out.println("the person is a senior citizen");
       }
       else{
           System.out.println("please enter a valid age");
       }
       sc.close();

    }
    
}
