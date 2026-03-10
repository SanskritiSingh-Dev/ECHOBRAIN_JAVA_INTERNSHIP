package POLYMORHISM;
class Payment {
   final  void display(){
        System.out.println("mthod in parent");
    }
    
}
class creditCardPAyment extends Payment{
    @Override
 final void display(){
        System.out.println("method in child");
        
    }
}

class debitCard extends Payment{
   final void display(){
        System.out.println("i am child 2 of parent 1");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p = new creditCardPAyment();
        p.display();
    }
}
