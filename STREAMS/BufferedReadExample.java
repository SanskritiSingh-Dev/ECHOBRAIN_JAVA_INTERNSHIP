package STREAMS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadExample {
    public static void main(String[] args) {
        ////wrap up file reader insidebufferedReader for efficient reading
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"));) {
            String line;

            //read file line by line until end of file is reached
            while((line = br.readLine()) != null){
                //print each line read from file
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }
    
}
