package IOSTREAMS;

import java.io.FileInputStream;
import java.io.IOException;
public class ByteInputArrayExample {
    public static void main(String[] args) {
        //create fileInputStream
        try(FileInputStream fis = new FileInputStream("byteArray.txt");) {
            //create a byte array to hold the data
            byte[] buffer = new byte[10];//read 10 bytes at a time

            int byteRead;

            //read data into buffer
            while((byteRead = fis.read(buffer)) != -1){
                //convert byte array to string
                String data = new String(buffer, 0, byteRead);

                //print the data
                System.out.println("Data read from file: " + data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
