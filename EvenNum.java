import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the how many numbers you want: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i =1; i<=n; i++){
            if(i % 2 == 0){
                count++;
            }
        }
        System.out.println("the count of even number is: "+ count);
        sc.close();
    }
}