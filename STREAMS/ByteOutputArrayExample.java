package STREAMS;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputArrayExample {
    public static void main(String[] args) {
        //create FileOutputStream (output stream)
        try( FileOutputStream fos = new FileOutputStream("byteArray.txt");) {
            //create a string
            String data ="This is an example of ByteOutputStream using byte array.";

            ///convert string into byte array
            byte[] byteArray = data.getBytes();

            //write byte array to file
            fos.write(byteArray);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
