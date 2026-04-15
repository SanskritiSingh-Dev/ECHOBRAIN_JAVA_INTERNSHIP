import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        //load the driver class
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcDB",
                "root",
                "Shivani@140804"
            )) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Fetch data from the database
                String query = "SELECT * FROM student";

                // Create a statement
                Statement st = con.createStatement();

                // Execute the query
                ResultSet rs = st.executeQuery(query);

                // Process the result set
                while(rs.next()){
                    System.out.println(
                        rs.getInt("id") + " " + 
                        rs.getString("name")
                    );
                }

                // Close the connection
                con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
