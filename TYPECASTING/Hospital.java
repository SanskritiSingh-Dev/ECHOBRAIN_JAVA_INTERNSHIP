package TYPECASTING;

class Animal {

    Animal() {
        System.out.println("Animal admitted to hospital");
    }

    void treatment() {
        System.out.println("Animal is getting treatment");
    }
}

class Dog extends Animal {

    String name;

    Dog(String name) {
        this.name = name;
        System.out.println("Dog patient: " + name);
    }

    void dogCheckup() {
        System.out.println(name + " is getting dog vaccination");
    }
}

class Cat extends Animal {

    String name;

    Cat(String name) {
        this.name = name;
        System.out.println("Cat patient: " + name);
    }

    void catCheckup() {
        System.out.println(name + " is getting cat dental checkup");
    }
}

class Cow extends Animal {

    String name;

    Cow(String name) {
        this.name = name;
        System.out.println("Cow patient: " + name);
    }

    void cowCheckup() {
        System.out.println(name + " is getting cow health checkup");
    }
}

public class Hospital {

    public static void main(String[] args) {

        Animal patients[] = new Animal[3];

        patients[0] = new Dog("Tommy");   // Upcasting
        patients[1] = new Cat("Kitty");   // Upcasting
        patients[2] = new Cow("Ganga");   // Upcasting

        System.out.println("\nGeneral Treatment for All Animals:");

        for(int i = 0; i < patients.length; i++) {
            patients[i].treatment();
        }

        System.out.println("\nSpecial Checkup:");

        Dog d = (Dog) patients[0];   // Downcasting
        d.dogCheckup();

        Cat c = (Cat) patients[1];   // Downcasting
        c.catCheckup();

        Cow cw = (Cow) patients[2];  // Downcasting
        cw.cowCheckup();
    }
}