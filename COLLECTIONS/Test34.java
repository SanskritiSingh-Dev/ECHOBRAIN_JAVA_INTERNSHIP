public class Test34 {
    interface myInterface {
        void display();
    }
public static void main(String[] args) {
    myInterface m = new myInterface() {
        @Override
        public void display() {
            System.out.println("Hello from the anonymous class!");
        }
    };
}
}