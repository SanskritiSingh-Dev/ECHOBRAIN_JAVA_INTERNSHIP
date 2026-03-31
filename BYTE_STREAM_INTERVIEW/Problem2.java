//Write a program to copy data from one file to another using byte streams.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) {
        //opem file for reading and writing
        try{
            FileInputStream fis = new FileInputStream("file1.txt");
            FileOutputStream fos = new FileOutputStream("dest.txt");

            int data;
            //read and write byte by byte
            while((data = fis.read()) != -1){
                fos.write(data);
            }
            fis.close();
            fos.close();

            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
}
