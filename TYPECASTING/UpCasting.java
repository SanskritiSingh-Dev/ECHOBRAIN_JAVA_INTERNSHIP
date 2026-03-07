package TYPECASTING;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpCasting {
    public static void main(String[] args) {

        Animal a = new Dog();   // Upcasting

        a.sound();   // accessible
        // a.bark();  // ERROR (not accessible)
    }
}