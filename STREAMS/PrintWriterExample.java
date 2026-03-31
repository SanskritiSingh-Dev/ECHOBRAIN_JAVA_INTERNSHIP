import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {

    public static void main(String[] args) {

        try {
            // Create PrintWriter object
            PrintWriter pw = new PrintWriter("print.txt");

            // Write data
            pw.println("Hello PrintWriter!");
            pw.println("This is second line.");

            // Write different data types
            pw.println(100);
            pw.println(45.67);
            pw.println(true);

            // Close stream
            pw.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
