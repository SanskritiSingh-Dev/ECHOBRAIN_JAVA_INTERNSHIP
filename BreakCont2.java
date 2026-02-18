import java.util.Scanner;
public class BreakCont2 {
    //ask the user to enter the numbers contineously, skip negitive numer, print only positive number, stop when user enters 0
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers: ");
        while(true){
            int num = sc.nextInt();
            if(num ==0){
                System.out.println("0 entered. Stopping the loop.");
                break;
            }
            else if( num < 0){
                continue;
            }
            else{
                System.out.println(num);
            }
        }
        sc.close();
    }
    
}
