package STREAMS;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MultiLineWrite {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))){
            //write multiple lines
            bw.write("first line");
            bw.newLine(); // move to next line
            bw.write("second line");
            bw.newLine();
            bw.write("third line");

            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }
    
}
