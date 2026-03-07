package ACCESS_MODIFIERS;

class Student {
    private int age = 21;

    void display() {
        System.out.println(age);
    }
}

public class Private {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();  // allowed
        // System.out.println(s.age);  // ERROR (private)
    }
}
