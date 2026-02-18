import java.util.Scanner;

public class NumPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n numbers you want: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        sc.close();

    }
}
