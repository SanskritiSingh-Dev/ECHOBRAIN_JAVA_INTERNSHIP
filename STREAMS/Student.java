import java.io.Serializable;
//student class must implement Serializable

public class Student implements Serializable {
    private int id;
    private String name;

    //constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
