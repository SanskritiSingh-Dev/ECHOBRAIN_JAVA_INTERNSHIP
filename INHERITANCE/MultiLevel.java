package INHERITANCE;

class PARENT {
    public void greet(){
        System.out.println("HEllo bacho");
    }

}
class Child1 extends PARENT{
    public void greet1(){
        System.out.println("hello dad from child 1");
    }

}
class Child2 extends PARENT{
    public void greet2(){
        System.out.println("hello dad from child 2");
    }

}

public class MultiLevel {
    public static void main(String[] args) {
        PARENT p = new PARENT();
        Child1 c1 =new Child1();
        Child2 c2 = new Child2();
        p.greet();
        c1.greet();
        c2.greet();

        c1.greet1();
        c2.greet2();        
    }

    
}
