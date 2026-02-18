
import java.util.Scanner;
public class InvertLeftTriangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows you want: ");
        int n = sc.nextInt();

        // Print inverted left triangle
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
