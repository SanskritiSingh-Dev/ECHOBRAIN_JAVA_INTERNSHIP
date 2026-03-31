//Write a program to append data to an existing file using FileOutputStream.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem3 {
    public static void main(String[] args) {
        //open file 
        try(FileOutputStream fos = new FileOutputStream("file1.txt", true)) {
            //data writting
            String data = "\nWelcome to the class of Java..";
            //convert string - byte array
            byte[] arr = data.getBytes();
            //write byte in file
            fos.write(arr);

            System.out.println("Data appended successfully");

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
