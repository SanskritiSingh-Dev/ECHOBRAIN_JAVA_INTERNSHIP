import java.util.Scanner;

public class DivBy3 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =1; i<=100; i++){
            if(i % 3 == 0){
                count++;
            }
        }
        System.out.println("the total numbers div by 3 is "+ count);
    }
    
}
