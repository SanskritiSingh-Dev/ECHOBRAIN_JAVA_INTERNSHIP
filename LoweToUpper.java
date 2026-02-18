import java.util.Scanner;

public class LoweToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //convert lowercase char to upper case char by using only if else statement and asci values
        //difference between lowercase and uppercase char is 32 in ascii values. so we can use that to convert lowercase char to uppercase char.
        System.out.println("enter a lowercase character: ");
        char lowercase = sc.next();
        if(lowercase >= 'a' && lowercase <= 'z'){
            char uppercase = (char)(lowercase - 32);
            System.out.println("The uppercase character is: " + uppercase);
        }
        else{
            System.out.println("Please enter a valid lowercase character.");
        }

        System.out.println("-----------------------------------------------");

        //convert lowercase char to uppercase char by using if else statement
        System.out.println("enter a lowercase character: ");
        char lowercase = sc.next().charAt(0);
        if(lowercase >= 'a' && lowercase <= 'z'){
            char uppercase = (char)(lowercase - 'a' + 'A');
            System.out.println("The uppercase character is: " + uppercase);
        }
        else{
            System.out.println("Please enter a valid lowercase character.");
        }

        //check if the input char is an upper case or not
        System.out.println("enter the charactr:");
        char character = sc.next().charAt(0);
        if(character >='A' && character <='Z'){
            System.out.println("the character is an upper case character");
        }
        else{
            System.out.println("the character is not an upper case character");
        }

        System.out.println("-----------------------------------------------");
        //write a program to check if the number is vowel or not
        System.out.println("enter a character: ");
        char ch = sc.next();
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("The character is a vowel.");
        }
        else{
            System.out.println("The character is not a vowel.");
        }
        sc.close();
    }
}
