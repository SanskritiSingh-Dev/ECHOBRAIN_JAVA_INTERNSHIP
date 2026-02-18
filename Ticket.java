import java.util.Scanner;
public class Ticket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //check the ticket number and print the appropriate message
        System.out.println("enter the ticket number and also if you have the ticket: ");
        String t = sc.next(); 
        int ticketNum = sc.nextInt();
        int ticketNumForFirstSlot = 1002;
        String ticket = "havingTicket";
        if(ticketNum == ticketNumForFirstSlot && t.equals(ticket)){
            System.out.println("enjoy your movie. Thank you for booking 1st slot with us.");
        }
        else{
            System.out.println("oops!! Please check your ticket number and try again for next slot.");
        }
        sc.close();

    }
    
}
