package IOSTREAMS;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderExample {

    public static void main(String[] args) {

        try {
            // Input from keyboard (System.in is byte stream)
            InputStreamReader isr = new InputStreamReader(System.in);

            int data;

            System.out.println("Enter characters (press Enter to stop):");

            // Read characters from keyboard
            while ((data = isr.read()) != '\n') {
                System.out.print((char) data);
            }

            isr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
