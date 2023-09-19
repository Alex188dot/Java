package DBManagement;
import java.sql.*;
import java.util.Scanner;

public class searchDB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");

            System.out.println("Insert a city and I will show you the users who live there: ");
            String city = in.nextLine();

            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE city = '" + city + "'");

            if (rs.next()) {
                while (rs.next()) {
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Lastname: " + rs.getString("lastname"));
                    System.out.println("Age: " + rs.getInt("age"));
                    System.out.println("------------------");
                }
            } else {
                System.out.println("City not found");
            }


        } catch (SQLException ex) {
            System.out.println("Connection failed");
            throw new RuntimeException(ex);
    }



    }
}
