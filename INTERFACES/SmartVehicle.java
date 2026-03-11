package INTERFACES;
/*
Scenario: Smart Vehicle System

A vehicle can have:

Engine control

Electric system

Both interfaces provide a default status() method, which creates a conflict that the implementing class must resolve.
 */

//interface1
interface EngineControl {
    void startEngine(); //abstract method

    default void status(){ //default method
        System.out.println("engine is active now..");
    }

    static void engineInfo(){ //static method
        System.out.println("engineControl interface.");
    }
}

//interface2
interface ElectricControl {
    void chargeBattery(); //abstract method

    default void status(){ //same method so conflict
        System.out.println("engine is active now..");
    }
}

class SmartCar implements EngineControl, ElectricControl{
    public void startEngine(){
        System.out.println("car engine started..");
    }

    public void chargeBattery(){
        System.out.println("battery charging..");
    }

    //When a class implements multiple interfaces that contain the same default method, the class must override the method and explicitly specify which interface method to call using InterfaceName.super.methodName().
    public void status(){
        //call interface default methods
        EngineControl.super.status();
        ElectricControl.super.status();

        System.out.println("smart car system is ready..");
    }
}

public class SmartVehicle {
    public static void main(String[] args) {
        SmartCar sc = new SmartCar();

        sc.startEngine();
        sc.chargeBattery();
        sc.status();

        //calling interface static method
        EngineControl.engineInfo();
    }
    
}
