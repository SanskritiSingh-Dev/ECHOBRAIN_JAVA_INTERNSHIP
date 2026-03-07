package POLYMORHISM;

class Animal{
    void sound(){
        System.out.println("anmial make sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat neows");
    }
}
public class OverRiding {
    public static void main(String[] args) {
        Animal a;
        a = new Dog(); //upcasting
        a.sound();//dogs sound

        a = new Cat(); //upcasting
        a.sound();//cat sound

    }
    
}
/*Method overriding occurs when a child class provides its own implementation of a method that already exists in the parent class. It is used to achieve runtime polymorphism in Java.
A method cannot be overridden if it is declared as final, static, or private, because final methods cannot be modified, static methods belong to the class, and private methods are not inherited.
*/
