import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        // Wrap FileReader with BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("charBuffer.txt"))){
            String line;

            // Read line by line
            while ((line = br.readLine()) != null) {

                // Print each line
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}