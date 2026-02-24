import java.util.Scanner;

public class Method6 {
    public static int SquareNum(int num){
        int sq = 0;
        if(num != 0){
            sq = num*num;
        }
        return sq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        
        int res = SquareNum(n);
        System.out.println("square of the number is :" + res);

    }

}
