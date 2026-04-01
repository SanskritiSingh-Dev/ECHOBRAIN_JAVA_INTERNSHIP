/*Write a program to demonstrate what happens when the order of reading and
writing using DataInputStream and DataOutputStream is mismatched. */

import java.io.*;

public class Problem7 {
    public static void main(String[] args){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("mismatchedData.txt"))) {
            dos.writeInt(42); //integer
            dos.writeUTF("Hello, World!"); //string 
            dos.writeDouble(3.14); //double value
            System.out.println("Data written successfully");

            //reading in wrong order
            DataInputStream dis = new DataInputStream(new FileInputStream("mismatchedData.txt"));
            String str = dis.readUTF(); // trying to read string first (should be int)
            int num = dis.readInt(); // trying to read int next (should be string)
            double d = dis.readDouble(); // trying to read double (should be double)
    
            dis.close();
            
            System.out.println("Read String: " + str);
            System.out.println("Read Integer: " + num);
            System.out.println("Read Double: " + d);
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());

        }
    }

}