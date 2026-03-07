package TYPECASTING;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class DownCasting {
    public static void main(String[] args) {

        Animal a = new Dog();  // Upcasting

        Dog d = (Dog) a;       // Downcasting

        d.bark();
        d.sound();
    }
}
