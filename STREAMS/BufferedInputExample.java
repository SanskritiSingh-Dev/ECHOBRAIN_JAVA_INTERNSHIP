package STREAMS;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputExample {

    public static void main(String[] args) {

        try {
            // Create FileInputStream
            FileInputStream fis = new FileInputStream("buffered.txt");

            // Wrap with BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Create buffer array
            byte[] buffer = new byte[10];

            int bytesRead;

            // Read data into buffer
            while ((bytesRead = bis.read(buffer)) != -1) {

                // Convert valid bytes into string
                System.out.print(new String(buffer, 0, bytesRead));
            }

            // Close stream
            bis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
