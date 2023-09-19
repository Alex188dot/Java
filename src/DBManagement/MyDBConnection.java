package DBManagement;
import java.sql.*; //Library for DB use
public class MyDBConnection {
    public static void main(String[] args) throws SQLException {

        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBManagement", "root", "root");

    }
}
