package TYPECASTING;

class Animal {
    Animal(){
        System.out.println("Animal constructor");
    }
}
class Dog extends Animal{
    int age;
    Dog(int age){
        this.age = age;
        System.out.println("dog constructor, age" + this.age);
    }
    void display(){
        System.out.println("Dog age is " + age);
    }
}
public class UsingConst {
    public static void main(String[] args) {
        Animal a = new Dog(5);
        Dog d = (Dog) a;
        d.display();

    }
    
}

/*output: Animal constructor
          dog constructor, age = 5
          dog age is 5 */
