package IOSTREAMS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        //create object
        try{
            Student s1 = new Student(101, "abc");

            //create stream chain
            FileOutputStream fos = new FileOutputStream("student.txt");
            //convert obj to byte stream
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                //convert obj to byte stream
                oos.writeObject(s1);
            }
            System.out.println("object serialized successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
