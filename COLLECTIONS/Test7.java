// public class Test7 {
//     public static void main(String[] args) {
//         Box box = new Box();
//         box.setValue("Hello, World!");
//         System.out.println(box.getValue());

//         Box box2 = new Box();
//         box2.setValue(123);
//         System.out.println(box2.getValue());

//         // Integer value = (Integer) box.getValue();
//         // System.out.println(value); //this will throw a ClassCastException at runtime

//         Integer value2 = (Integer) box2.getValue();
//         System.out.println(value2); // this will work fine

//     }

// }

public class Test7 {
    public static void m1(Box<?> b){
        System.out.println(b.getValue());
    }

    public static void main(String[] args) {
        Box<String> b1 = new Box<String>();
        b1.setValue("hi");

        Box<Integer> b2 = new Box<>();
        b2.setValue(6000);

        m1(b1);
        m1(b2);
    }
}
