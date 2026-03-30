package STREAMS;

import java.io.FileReader;
import java.io.IOException;
public class FileReadingExample {
    public static void main(String[] args) {
        //create fileReader object uing try - in - resources to ensure it is closed after use
        try(FileReader fr = new FileReader("test.txt")){
            //var to store each char
            int data;
            //read data one char at a time
            while((data = fr.read()) != -1){
                //convert int to char and print
                System.out.print((char)data);
            }
        }catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
    }
}
