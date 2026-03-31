import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {
        // Wrap FileWriter with BufferedWriter
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("charBuffer.txt"))){

            // Write text
            bw.write("Hello Buffered Writer!");
            bw.newLine(); // move to next line

            bw.write("This is second line.");
            bw.newLine();

            bw.write("Fast writing using buffer.");

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}