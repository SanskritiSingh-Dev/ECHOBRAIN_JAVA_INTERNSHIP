import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeBatchCrud {
    // JDBC connection details
    static final String URL = "jdbc:mysql://localhost:3306/assignment";
    static final String USER = "root";
    static final String PASS = "Shivani@140804";

    public static void main(String[] args) throws SQLException {
        // //connection establishment
        // try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

        // con.setAutoCommit(false); // 🔥 Transaction start

        // // 🔹 1. BATCH INSERT
        // String insertQuery = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?)";
        // PreparedStatement insertPs = con.prepareStatement(insertQuery);

        // // Employee 1
        // insertPs.setInt(1, 1);
        // insertPs.setString(2, "Aman");
        // insertPs.setString(3, "Pandey");
        // insertPs.setDouble(4, 50000);
        // insertPs.setString(5, "Male");
        // insertPs.setString(6, "IT");
        // insertPs.addBatch();

        // // Employee 2
        // insertPs.setInt(1, 2);
        // insertPs.setString(2, "jojo");
        // insertPs.setString(3, "chaturvedi");
        // insertPs.setDouble(4, 60000);
        // insertPs.setString(5, "Male");
        // insertPs.setString(6, "development");
        // insertPs.addBatch();

        // // Employee 3
        // insertPs.setInt(1, 3);
        // insertPs.setString(2, "Sneha");
        // insertPs.setString(3, "Sharma");
        // insertPs.setDouble(4, 55000);
        // insertPs.setString(5, "Female");
        // insertPs.setString(6, "HR");
        // insertPs.addBatch();

        // // Employee 4
        // insertPs.setInt(1, 4);
        // insertPs.setString(2, "Priya");
        // insertPs.setString(3, "Verma");
        // insertPs.setDouble(4, 58000);
        // insertPs.setString(5, "Female");
        // insertPs.setString(6, "Marketing");
        // insertPs.addBatch();

        // //Creating statement
        // Statement st = con.createStatement();
        // ResultSet rs = st.executeQuery("SELECT * FROM employees");

        // // Execute batch
        // System.out.println("\n employee records: " );
        // while(rs.next()){
        // System.out.println(
        // rs.getInt("id") + " | " +
        // rs.getString("first name") + " | " +
        // rs.getString("last name") + " | " +
        // rs.getDouble("salary") + " | " +
        // rs.getString("gender") + " | " +
        // rs.getString("department")
        // );
        // }

        // //batch update
        // String updateQuery = "UPDATE employees SET salary = salary + 5000 WHERE id =
        // ?";
        // PreparedStatement updatePs = con.prepareStatement(updateQuery);
        // updatePs.setInt(1, 1); // Update salary for employee with id=2
        // updatePs.addBatch();
        // updatePs.setInt(1, 2); // Update salary for employee with id=3
        // updatePs.addBatch();
        // updatePs.setInt(1, 3); // Update salary for employee with id=4
        // updatePs.addBatch();
        // updatePs.setInt(1, 4); // Update salary for employee with id=5
        // updatePs.addBatch();

        // updatePs.executeBatch(); // Execute batch update
        // con.commit(); //Transaction commit
        // }

        // catch (SQLException e) {
        // System.out.println("Database Error: " + e.getMessage());
        // }

        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {

            con.setAutoCommit(false); // 🔥 transaction start

            // 🔹 1. BATCH INSERT
            String insertQuery = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertPs = con.prepareStatement(insertQuery);

            System.out.print("How many employees to insert? ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Employee " + (i + 1));

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("First name: ");
                String fname = sc.nextLine();

                System.out.println("Last name: ");
                String lname = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.print("Gender: ");
                String gender = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                insertPs.setInt(1, id);
                insertPs.setString(2, fname);
                insertPs.setString(3, lname);
                insertPs.setDouble(4, salary);
                insertPs.setString(5, gender);
                insertPs.setString(6, dept);

                insertPs.addBatch(); // 🔥 batch add
            }

            insertPs.executeBatch();
            System.out.println("Batch Insert Done");

            // 🔹 2. VIEW DATA
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            System.out.println("\nEmployee Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("first_name") + " | " +
                                rs.getString("last_name") + " | " +
                                rs.getDouble("salary") + " | " +
                                rs.getString("gender") + " | " +
                                rs.getString("department"));
            }

            // 🔹 3. BATCH UPDATE
            System.out.print("\nHow many employees to update salary? ");
            int u = sc.nextInt();

            String updateQuery = "UPDATE employees SET salary = salary + 5000 WHERE id=?";
            PreparedStatement updatePs = con.prepareStatement(updateQuery);

            for (int i = 0; i < u; i++) {
                System.out.print("Enter ID to update: ");
                int uid = sc.nextInt();

                updatePs.setInt(1, uid);
                updatePs.addBatch();
            }

            updatePs.executeBatch();
            System.out.println("Batch Update Done");

            // 🔹 4. BATCH DELETE
            System.out.print("\nHow many employees to delete? ");
            int d = sc.nextInt();

            String deleteQuery = "DELETE FROM employees WHERE id=?";
            PreparedStatement deletePs = con.prepareStatement(deleteQuery);

            for (int i = 0; i < d; i++) {
                System.out.print("Enter ID to delete: ");
                int did = sc.nextInt();

                deletePs.setInt(1, did);
                deletePs.addBatch();
            }

            deletePs.executeBatch();
            System.out.println("Batch Delete Done");

            con.commit(); // save all changes

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
