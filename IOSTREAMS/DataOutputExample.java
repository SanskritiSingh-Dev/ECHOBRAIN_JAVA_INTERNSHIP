package IOSTREAMS;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class DataOutputExample {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))) {
            // Writing different types of data to the file
            dos.writeInt(42); // Write an integer
            dos.writeDouble(3.14); // Write a double
            dos.writeUTF("Hello, World!"); // Write a string in UTF format
            dos.writeBoolean(true); // Write a boolean

            System.out.println("data written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
