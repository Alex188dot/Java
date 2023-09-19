package DBManagement;
import java.sql.*; //Library for DB use
public class MyDBConnection {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            System.out.println("Connection successful");
            System.out.println("------------------");

            Statement st = connect.createStatement();

            // Once I have the statement I can write the query
            String query = "SELECT * FROM users";

            // Execute the query and save the results
            ResultSet rs = st.executeQuery(query);

            // ResultSet contains the results of the query, it is an array of rows
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Lastname: " + rs.getString("lastname"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("------------------");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }

    }
}
