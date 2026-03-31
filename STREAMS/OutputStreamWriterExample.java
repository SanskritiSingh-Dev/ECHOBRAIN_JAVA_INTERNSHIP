import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriterExample {

    public static void main(String[] args) {

        try {
            // Output to console (System.out is byte stream)
            OutputStreamWriter osw = new OutputStreamWriter(System.out);

            String data = "Hello using OutputStreamWriter!\n";

            // Write characters
            osw.write(data);

            osw.flush(); // force output

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
