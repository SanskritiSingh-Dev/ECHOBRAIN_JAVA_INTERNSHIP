package INHERITANCE;

class Parent1 {
    String name;
    int age;
    void m1(){
        System.out.println("parent");
    }
}

class Child extends Parent1 {

}
public class Parent{
    public static void main(String[] args) {
        Child c = new Child();
        c.m1();
        
    }
}
    