package ACCESS_MODIFIERS;

class Animal {
    protected void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void bark() {
        sound();   // allowed because of inheritance
        System.out.println("Dog barks");
    }
}
public class Protected {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
