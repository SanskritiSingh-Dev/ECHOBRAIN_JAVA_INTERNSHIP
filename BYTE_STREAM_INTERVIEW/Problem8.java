/* Create a class Student and write a program to serialize and deserialize objects using ObjectOutputStream and ObjectInputStream.*/

import java.io.*;
//creating class
class Student implements Serializable {
    int id;
    String name;
    Double marks;

    //constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }   
}
public class Problem8 {
    public static void main(String[] args) {
        //serializaation
        try {
            //object
            Student s1 = new Student (1, "John", 85.5);
            //objectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.obj"));
            //write
            oos.writeObject(s1);
            oos.close();
            System.out.println("Object serialized successfully");
            
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        //deserialization
        try {
            //ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.obj"));
            //read
            Student s2 = (Student) ois.readObject();
            ois.close();

            //display
            System.out.println("Student ID: " + s2.id);
            System.out.println("Student Name: " + s2.name);
            System.out.println("Student Marks: " + s2.marks);
            System.out.println("Object deserialized successfully");
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}
