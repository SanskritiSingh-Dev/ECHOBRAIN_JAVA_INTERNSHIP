//package RECURSION;
//sum fo all numbers
public class R3 {
    static int m1(int a){
        if(a == 0){
            return 0;
        }
        return a +  m1(a-1);
    }
    public static void main(String[] args) {
        System.out.println(m1(5));
    }
    
}
