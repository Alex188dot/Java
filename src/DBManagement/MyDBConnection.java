package DBManagement;
import java.sql.*; //Library for DB use
public class MyDBConnection {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }

    }
}
