/*Write a program to store multiple student details (id, name, marks) using
DataOutputStream and read them using DataInputStream.*/

import java.io.*;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try (
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("studentData.txt"));
        ) {

            int n = 3;

            System.out.println("Enter student details (id, name, marks): ");

            for (int i = 1; i <= n; i++) {
                System.out.println("Student " + i + ":");
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Name: ");
                String name = sc.nextLine(); 
                System.out.print("Marks: ");
                double marks = sc.nextDouble();

                dos.writeInt(id);
                dos.writeUTF(name);
                dos.writeDouble(marks);
            }

            System.out.println("Data written successfully\n");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ------------------ READING ------------------

        try (
            DataInputStream dis = new DataInputStream(new FileInputStream("studentData.txt"));
        ) {

            System.out.println("Student details:\n");
            
            // Use available() or EOFException to read until end of file
            while (dis.available() > 0) {
                int id = dis.readInt();
                String name = dis.readUTF();
                double marks = dis.readDouble();

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
                System.out.println("-------------------");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}