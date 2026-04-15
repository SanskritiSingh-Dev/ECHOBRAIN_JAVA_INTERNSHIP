package studentmgmtsys;

import java.sql.*;
import java.util.Scanner;

public class StudentMgmtSys {

    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USER = "root";
    static final String PASS = "Shivani@140804";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            // 🔐 LOGIN SYSTEM
            if (!login(con)) {
                System.out.println("❌ Invalid Login!");
                return;
            }

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert");
                System.out.println("2. View");
                System.out.println("3. Search");
                System.out.println("4. Update");
                System.out.println("5. Delete");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        insertStudent(con);
                        break;
                    case 2:
                        viewStudents(con);
                        break;
                    case 3:
                        searchStudent(con);
                        break;
                    case 4:
                        updateStudent(con);
                        break;
                    case 5:
                        deleteStudent(con);
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔐 LOGIN
    static boolean login(Connection con) throws SQLException {

        System.out.print("Username: ");
        String user = sc.next();

        String pass;

        // 🔐 Hide password input
        if (System.console() != null) {
            char[] passwordArray = System.console().readPassword("Password: ");
            pass = new String(passwordArray);
        } else {
            // fallback (VS Code terminal sometimes doesn't support console)
            System.out.print("Password: ");
            pass = sc.next();
        }

        String query = "SELECT * FROM admin WHERE username=? AND password=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, user);
        ps.setString(2, pass);

        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    // ➕ INSERT
    static void insertStudent(Connection con) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        // 🔴 CHECK DUPLICATE
        String check = "SELECT * FROM students WHERE id=?";
        PreparedStatement psCheck = con.prepareStatement(check);
        psCheck.setInt(1, id);
        ResultSet rs = psCheck.executeQuery();

        if (rs.next()) {
            System.out.println("❌ ID already exists!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        String query = "INSERT INTO students VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, marks);

        ps.executeUpdate();
        System.out.println("✅ Inserted!");
    }

    // 📄 VIEW
    static void viewStudents(Connection con) throws SQLException {
        String query = "SELECT * FROM students";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("\n--- Students ---");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getInt("marks"));
        }
    }

    // 🔍 SEARCH
    static void searchStudent(Connection con) throws SQLException {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        String query = "SELECT * FROM students WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Found: " +
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("marks"));
        } else {
            System.out.println("❌ Not Found!");
        }
    }

    // ✏️ UPDATE
    static void updateStudent(Connection con) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Marks: ");
        int marks = sc.nextInt();

        String query = "UPDATE students SET name=?, marks=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, marks);
        ps.setInt(3, id);

        int rows = ps.executeUpdate();
        if (rows > 0)
            System.out.println("✏️ Updated!");
        else
            System.out.println("❌ Not Found!");
    }

    // 🗑️ DELETE
    static void deleteStudent(Connection con) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        String query = "DELETE FROM students WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);

        int rows = ps.executeUpdate();
        if (rows > 0)
            System.out.println("🗑️ Deleted!");
        else
            System.out.println("❌ Not Found!");
    }
}
