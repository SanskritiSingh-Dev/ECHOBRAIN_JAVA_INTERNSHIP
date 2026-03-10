package ABSTRACTION;

abstract class Vehicle{
    String brand;
    int speed;

    //constructor
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    //abstract method
    abstract void start();
    abstract void stop();

    //concrete method
    public void displayInfo(){
        System.out.println("brand: " + brand);
        System.out.println("speed: " + speed);
    }
}
class Car extends Vehicle{
    //constructor
    Car(String brand, int speed){
        super(brand, speed);
    }
    void start(){
        System.out.println("Car started..");

    }
    void stop(){
        System.out.println("Car stoped..");

    }
}

class Bike extends Vehicle{
    //constructor
    Bike(String brand, int speed){
        super(brand, speed);
    }
    void start(){
        System.out.println("Bike started..");

    }
    void stop(){
        System.out.println("Bike stoped..");

    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle v;
        v = new Bike("Royal Enfield", 90);
        v.displayInfo();
        v.start();
        v.stop();

        v = new Car("MAhindra Thar", 200);
        v.displayInfo();
        v.start();
        v.stop();
    }
}
