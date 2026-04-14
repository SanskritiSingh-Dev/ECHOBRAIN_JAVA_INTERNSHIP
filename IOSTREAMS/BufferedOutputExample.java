package IOSTREAMS;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputExample {

    public static void main(String[] args) {

        try {
            // Create FileOutputStream
            FileOutputStream fos = new FileOutputStream("buffered.txt");

            // Wrap it with BufferedOutputStream
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // Data to write
            String data = "Hello Buffered Byte Stream using Array!";

            // Convert string to byte array
            byte[] bytes = data.getBytes();

            // Write byte array into buffer
            bos.write(bytes);

            // Flush ensures all data is written to file
            bos.flush();

            // Close stream
            bos.close();

            System.out.println("Data written using BufferedOutputStream!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
