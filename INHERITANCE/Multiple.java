package INHERITANCE;
interface GrandParent{
    public void hello(); //no body only defination
}
interface Parent {
    public void hello1(); 
}

class Child implements GrandParent, Parent{
    public void hello(){ //class will implementthe interface method
        System.out.println("hello grandparent");
    }
    public void hello1(){
        System.out.println("hello parent");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Child c = new Child();
        c.hello();
        c.hello1();
    }
}
