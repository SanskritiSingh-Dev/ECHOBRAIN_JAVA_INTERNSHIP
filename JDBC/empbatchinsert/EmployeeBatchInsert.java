package empbatchinsert;

import java.sql.*;

public class EmployeeBatchInsert {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "Shivani@140804";

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection con = DriverManager.getConnection(url, user, password)) {

            String query = "INSERT INTO employees VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            // 🔥 Add employees to batch

            ps.setInt(1, 301);
            ps.setString(2, "Rahul");
            ps.setString(3, "IT");
            ps.setDouble(4, 50000);
            ps.addBatch();

            ps.setInt(1, 302);
            ps.setString(2, "Sneha");
            ps.setString(3, "HR");
            ps.setDouble(4, 45000);
            ps.addBatch();

            ps.setInt(1, 303);
            ps.setString(2, "Arjun");
            ps.setString(3, "Finance");
            ps.setDouble(4, 60000);
            ps.addBatch();

            ps.setInt(1, 304);
            ps.setString(2, "Priya");
            ps.setString(3, "IT");
            ps.setDouble(4, 55000);

            // important to add batch for the last record as well
            ps.addBatch();

            // 🚀 Execute batch
            int[] result = ps.executeBatch();

            System.out.println("✅ Employees inserted in batch!");
            System.out.println("Total inserted: " + result.length);

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
