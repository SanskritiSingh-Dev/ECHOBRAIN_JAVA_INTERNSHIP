package empbatchinsert;
import java.sql.*;

public class EmployeeBatchDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";   
        String password = "Shivani@140804";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM employees WHERE emp_id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            // Add employee IDs to batch for deletion
            ps.setInt(1, 301);
            ps.addBatch();

            ps.setInt(1, 302);
            ps.addBatch();

            ps.setInt(1, 303);
            ps.addBatch();

            ps.setInt(1, 304);
            ps.addBatch();

            //Execute batch
            int[] result = ps.executeBatch();

            System.out.println("Employees deleted in batch!");
            System.out.println("Total deleted: " + result.length);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
