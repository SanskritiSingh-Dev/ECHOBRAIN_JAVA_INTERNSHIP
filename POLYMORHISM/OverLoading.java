package POLYMORHISM;
class Calculator{
    int add(int a, int b){
        return a+b;

    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b, double c){
        return a+b+c;

    }
}
public class OverLoading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20, 30));
        System.out.println(c.add(10.2,20.2,30.2));
    }
    
}

/*Why It Is Called Compile-Time Polymorphism

The compiler decides which method to call during compilation based on the method parameters.
 Compile-time polymorphism is the ability of a class to have multiple methods with the same name but different parameters, where the method to be executed is determined at compile time.
 */
