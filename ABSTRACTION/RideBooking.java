/*Real-Life Scenario: Ride Booking System

Bike ride → cheaper fare

Car ride → medium fare

Luxury ride → expensive fare

User only sees book ride and total fare, not the calculation logic.
 */
package ABSTRACTION;

// main abastract class
abstract class Ride{
    int distance;
    //constructor
    Ride(int distance){
        this.distance = distance;
    }
    //abstract method
    //common for all child class
    abstract void calculateFare();

    //concrete method
    void rideStarted(){
        System.out.println("Ride startedfor " + distance + " km.");
    }

}

//child class 1
class BikeRide extends Ride{
    //constructor
    BikeRide(int distance){
        super(distance);
    }

    void calculateFare(){
        int fare = distance *5;
        System.out.println("Bike ride fare : " + fare);
    }
}
//child 2
class CarRide extends Ride{
        //constructor
    CarRide(int distance){
        super(distance);
    }

    void calculateFare(){
        int fare = distance *10;
        System.out.println("Bike ride fare : " + fare);
    }


}
//child 3
class LuxaryRide extends Ride{
        //constructor
    LuxaryRide(int distance){
        super(distance);
    }

    void calculateFare(){
        int fare = distance *20;
        System.out.println("Bike ride fare : " + fare);
    }

}

public class RideBooking {
    public static void main(String[] args) {
        Ride r; //parent reference

        r = new BikeRide(10);//upcasting
        r.rideStarted();//call parent class
        r.calculateFare();//call child class

        r = new CarRide(10);//upcasting
        r.rideStarted();//call parent class
        r.calculateFare();//call child class

        r = new LuxaryRide(10);//upcasting
        r.rideStarted();//call parent class
        r.calculateFare();//call child class
    }
    
}
