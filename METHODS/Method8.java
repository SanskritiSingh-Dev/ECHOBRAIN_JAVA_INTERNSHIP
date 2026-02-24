import java.util.Scanner;

public class Method8 {
    public static float MaxOfNum(float a, float b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers: ");
        float a = sc. nextFloat();
        float b = sc.nextFloat();
        float result = MaxOfNum(a, b);
        System.out.println("Maximum number is : " + result);
    }
}
