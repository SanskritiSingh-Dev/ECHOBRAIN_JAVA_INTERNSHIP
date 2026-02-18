/*Armstrong Number : 
	An Armstrong number is a number where: Each digit is raised to the power of number of digits, The sum of those values equals the original number(153). */
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to check the armstrong number: ");
        int range = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= range; i++){

            int num = i;
            int sum = 0;
            int org = num;
            int digitCount = 0;

            while(num > 0){
                digitCount++;
                num = num / 10;
            }

            num = org;

            while(num > 0){
                int digit = num % 10;
                sum += (int)Math.pow(digit, digitCount);
                num = num / 10;
            }

            if(sum == org){
                count++;
            }
        }
        System.out.println("Total Armstrong numbers are: " + count);

        sc.close();
    }
}


