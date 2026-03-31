import java.io.FileWriter;
import java.io.IOException;

public class CharacterWriteExample {
    public static void main(String[] args) {
        //create fileWriter 
        try(FileWriter fw = new FileWriter("char.txt")){
            //writing string 
            fw.write("hello world");

            System.out.println("data written successfully");
        } catch (IOException e) {
            // handle exception
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
