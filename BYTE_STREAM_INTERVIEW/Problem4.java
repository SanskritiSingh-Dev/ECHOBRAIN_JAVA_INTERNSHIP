//Write a program to count total number of bytes in a file.

import java.io.FileInputStream;
import java.io.IOException;

public class Problem4 {
    public static void main(String[] args) {
        //file to read
        try(FileInputStream fis = new FileInputStream("file1.txt")){
            //var to count bytes
            int c = 0;
            int data;

            //read byte by byte
            while((data = fis.read()) != -1){
                c++;
            }
            System.out.println("Total number of bytes in file: " + c);

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
