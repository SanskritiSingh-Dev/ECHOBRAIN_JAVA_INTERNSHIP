//Write a program to create a file and write data into it using FileOutputStream,then read it using FileInputStream.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem1{
    public static void main(String[] args) {
        //writing data 
        try(FileOutputStream fos = new FileOutputStream("file1.txt")) {
            //data writting
            String data = "Namaste India";
            //convert string - byte array
            byte[] arr = data.getBytes();
            //write byte in file
            fos.write(arr);

            System.out.println("Data written successfully");

            //Reading data
            FileInputStream fis = new FileInputStream("file1.txt");
            int i;
            System.out.println("Reading data..");
            //byte by byte reading
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

