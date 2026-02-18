
import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grades: ");
        int grade = sc.nextInt();
        char res;
        res = switch (grade / 10) {
            case 9 -> res = 'A';
            case 8 -> res = 'B';
            case 7 -> res = 'C';
            case 6 -> res = 'D';
            default -> res = 'F';
        };
        System.out.println("The grades are: ");
        System.out.println(res);
    }

}
