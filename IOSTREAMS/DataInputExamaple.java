package IOSTREAMS;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class DataInputExamaple {
    public static void main(String[] args) {
        //create stream chain
        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))){
            //read in sam order as written
            int id = dis.readInt();
            double marks = dis.readDouble();
            boolean status = dis.readBoolean();
            char grade = dis.readChar();
            String msg = dis.readUTF();

            System.out.println("id: " + id);
            System.out.println("marks: " + marks);
            System.out.println("status: " + status);
            System.out.println("grade: " + grade);
            System.out.println("msg: " + msg);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
