import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example {


        static final String DB_URL = "jdbc:mysql://localhost:3306/satishdb"; // Database URL
        static final String USER = "root";                                 // Database username
        static final String PASS = "SATISFY@JAVA45";                 // Database password

        public static void main(String[] args) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("MySQL JDBC Driver loaded!");

                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Connection established successfully!");


                String tableName = "my_table"; //
                String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName +
                        " (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), rollno VARCHAR(50))";

                Statement stmt = conn.createStatement();
                stmt.executeUpdate(createTableSQL);
                System.out.println("Table created successfully (if it didn't already exist).\n");


                String insertSQL = "INSERT INTO " + tableName + " (name, rollno) VALUES ('Mison/sabin', '12345')";
                int rowsInserted = stmt.executeUpdate(insertSQL);
                System.out.println(rowsInserted + " row(s) inserted.\n");

                String selectSQL = "SELECT * FROM " + tableName;
                ResultSet rs = stmt.executeQuery(selectSQL);

                System.out.println("Select Query Output:");
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Roll No: " + rs.getString("rollno"));
                }
                System.out.println();

                String updateSQL = "UPDATE " + tableName + " SET name = 'Mison/sabin' WHERE rollno = '12345'";
                int rowsUpdated = stmt.executeUpdate(updateSQL);
                System.out.println(rowsUpdated + " row(s) updated.\n");

                String deleteSQL = "DELETE FROM " + tableName + " WHERE rollno = '12345'";
                int rowsDeleted = stmt.executeUpdate(deleteSQL);
                System.out.println(rowsDeleted + " row(s) deleted.\n");

                rs.close();
                stmt.close();
                conn.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

