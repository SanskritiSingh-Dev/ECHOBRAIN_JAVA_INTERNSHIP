import java.util.Scanner;

public class While17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //find how many prime digits are there in the number
        System.out.println("enter the n");
        int n = sc.nextInt();
        int count = 0;
        while(n >=1){
            int digit = n % 10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7){
                count ++;
            }
            n = n/10;
        }
        System.out.println(count);
        sc.close();
    }
}
