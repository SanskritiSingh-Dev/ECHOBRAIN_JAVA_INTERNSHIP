public class Method12{
    public static void m1(){
        System.out.println("stsic m1 method");
    }
    public void m2 (){
        System.out.println("non static m2");
    }
    public static void main(String[] args) {
        m1();
        Method12 m12 = new Method12();
        m12.m2();

    }
}