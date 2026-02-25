//package RECURSION;

public class R2 {
    static void m1(int a){
        if(a == 0){
            return;
        }
        m1(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
        m1(10);
    }
    
}
