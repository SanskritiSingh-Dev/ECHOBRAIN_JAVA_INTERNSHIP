import java.util.Scanner;

public class Method10 {
    public static int ElementCount(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the elements:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("elements are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("the elemnt count is: ");
        int res = ElementCount(arr);
        System.out.println(res);

    }
}
