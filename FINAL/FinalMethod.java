package FINAL;

class Vehicle {
    final void start(){ // final method
        System.out.println("vehicle starts with engine");
    }
}
class Car extends Vehicle {
    //void start(); //cannot override final keyword

    void carInfo(){
        System.out.println("this is a car");
    }
}
