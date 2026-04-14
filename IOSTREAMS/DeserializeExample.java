package IOSTREAMS;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializeExample {

    public static void main(String[] args) {

        try {
            // Create stream chain
            FileInputStream fis = new FileInputStream("object.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Convert byte stream → object
            Student s2 = (Student) ois.readObject();

            ois.close();

            // Access object data
            System.out.println("ID: " + s2.getId());
            System.out.println("Name: " + s2.getName());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}