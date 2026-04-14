package IOSTREAMS;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReadExample {

    public static void main(String[] args) {
        // Open file for reading
        try(FileReader fr = new FileReader("char.txt")) {
            
            int data;

            // Read character by character
            while ((data = fr.read()) != -1) {

                // Convert int to char
                System.out.print((char) data);
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
