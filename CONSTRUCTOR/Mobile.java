public class Mobile {
    String brand;
    int price;
    
    public Mobile(String brand, int price){
        this.price = price;
        this.brand = brand;
    }
    public void display(){
        System.out.println("brand of mobile: " + brand);
        System.out.println(" price " + price);
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile("iphone", 150000);
        Mobile m2 = new Mobile("Samsung", 89000);
        System.out.println("Details of mobile 1: ");
        m1.display();
        System.out.println("details of mobile 2: ");
        m2.display();

    }
    
}
