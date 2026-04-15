import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        // Database connection parameters
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcDB",
                "root",
                "Shivani@140804")) {

            {
                // insert data into the database
                // insert data into the database
                String query = "INSERT INTO student(id, name) values(?, ?)";
                // create a prepared statement
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, 101);
                ps.setString(2, "Anjali");
                ps.setInt(1, 102);
                ps.setString(2, "Arjun");

                int rows = ps.executeUpdate();
                if (rows > 0) {
                    System.out.println("Data inserted successfully!");
                }
                // close the connection
            }

        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
