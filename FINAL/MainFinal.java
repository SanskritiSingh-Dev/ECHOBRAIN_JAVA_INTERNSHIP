package FINAL;

public class MainFinal {
    public static void main(String[] args) {
        //final var
        FinalVar fv = new FinalVar();
        fv.display();

        //final method
        Car c = new Car();
        c.start();//inherited final method
        c.carInfo();

        //finalclass
        FinalClass fc = new FinalClass();
        fc.showMessage();
    }
    
}
