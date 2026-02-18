import java.util.Scanner;

public class BreakCont {
    //print number from 1 to 100, skip multiples of 3, stop completely when number divisible by 17 appears
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("PrintNumbers from 1 to 100, skipping multiples of 3 and stopping at multiples of 17:");
        for(int i = 1; i <= 100; i++){
            if(i % 17 == 0){
                System.out.println("Number divisible by 17 found: " + i + ". Stopping the loop.");
                break;
            }
            if(i % 3 ==0){
                continue;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
