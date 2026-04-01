/*Write a program to merge two files into a third file using byte streams. */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem5 {

    public static void main(String[] args) {
        //opening the files
        try (FileInputStream fis1 = new FileInputStream("file1.txt"); FileInputStream fis2 = new FileInputStream("data.txt"); FileOutputStream fos = new FileOutputStream("merged.txt")) {

            byte[] buff = new byte[1024];
            int byteRead;

            //copy first file
            while((byteRead = fis1.read(buff)) != -1){
                fos.write(buff, 0, byteRead);
            }
            //copy second file
            while((byteRead = fis2.read(buff)) != -1){
                fos.write(buff, 0, byteRead);
            }
            System.out.println("Files merged successfully");
        } catch (IOException e) {
            System.out.println("Error occurred while merging files");
        }
    }
}
