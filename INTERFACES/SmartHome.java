package INTERFACES;
//interface
interface SmartDevice {
    //only abstract class
    void turnOn();
    void turnOff();
}
//class implementation
class Light implements SmartDevice {
    public void turnOn(){
        System.out.println("light is turned on.");

    }
    public void turnOff(){
        System.out.println("light is turned off.");

    }
}

class Fan implements SmartDevice {
        public void turnOn(){
        System.out.println("fan is turned on.");

    }
    public void turnOff(){
        System.out.println("fan is turned off.");

    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice d;
        d = new Light();
        d.turnOff();
        d.turnOn();

        d = new Fan();
        d.turnOff();
        d.turnOn();
    }
}
