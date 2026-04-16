import java.sql.*;

public class TestCall {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/assignment",
                "root",
                "Shivani@140804"
            );

            System.out.println("Connection established successfully!");

            // 🔹 1. CALL getAllEmps()
            CallableStatement cs1 = con.prepareCall("{call getAllEmps()}");
            ResultSet rs1 = cs1.executeQuery();

            System.out.println("\n--- All Employees ---");
            while (rs1.next()) {
                printRow(rs1);
            }

            // 🔹 Departments list
            String[] departments = {"IT", "Sales", "HR", "Finance", "Marketing"};

            for (String dept : departments) {

                // 🔹 2. CALL getAllDepartment(?)
                CallableStatement cs2 = con.prepareCall("{call getAllDepartment(?)}");
                cs2.setString(1, dept);

                ResultSet rs2 = cs2.executeQuery();

                System.out.println("\n--- " + dept + " Department Employees ---");

                boolean hasData = false;

                while (rs2.next()) {
                    hasData = true;
                    printRow(rs2);
                }

                if (!hasData) {
                    System.out.println("No employees found.");
                }

                // 🔹 3. CALL getMaxSalaryByDepartment(?, ?)
                CallableStatement cs3 = con.prepareCall("{call getMaxSalaryByDepartment(?, ?)}");

                cs3.setString(1, dept); // IN
                cs3.registerOutParameter(2, Types.DOUBLE); // OUT

                cs3.execute();

                double maxSalary = cs3.getDouble(2);

                System.out.println("Max Salary in " + dept + " = " + maxSalary);

                // close resources
                rs2.close();
                cs2.close();
                cs3.close();
            }

            // close main resources
            rs1.close();
            cs1.close();
            con.close();

            System.out.println("\n Connection closed successfully!");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 🔹 Reusable method to print employee row
    static void printRow(ResultSet rs) throws SQLException {
        System.out.println(
            rs.getInt("id") + " | " +
            rs.getString("first_name") + " | " +
            rs.getString("last_name") + " | " +
            rs.getDouble("salary") + " | " +
            rs.getString("gender") + " | " +
            rs.getString("department")
        );
    }
}