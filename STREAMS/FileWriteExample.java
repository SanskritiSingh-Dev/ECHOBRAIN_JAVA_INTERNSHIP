package STREAMS;
//writing text into file using FileWriter class

import java.io.FileWriter; // Import FileWriter class for file writing
import java.io.IOException; // Import exception handling

public class FileWriteExample {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("test.txt")) {
            // Write data into file
            fw.write("Hello, this is Java I/O!");

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            // Handle error if file operation fails
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
