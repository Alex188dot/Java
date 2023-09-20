package DBManagement;

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;
import java.sql.*;
import java.util.Stack;

public class insertIntoDB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name, lastname, city, query, query2, query3;
        int age;

        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");

            Statement st = connect.createStatement();

            name = "mario";
            lastname = "brown";
            city = "new york";
            age = 33;

            // Insert into all fields
            query = "INSERT INTO users VALUES(null,'"+name+"', '"+lastname+"', '"+city+"', "+age+")";

            // Insert only into mandatory fields (non-null)
            query2 = "INSERT INTO (name, lastname) users VALUES('"+name+"', '"+lastname+"')";

            // Insert in a different order than what is in the DB
            query3 = "INSERT INTO (lastname, age, name, city) users VALUES('"+lastname+"', "+age+", '"+name+"', '"+city+"')";

            // executeUpdate is to insert into the DB, executeQuery is to select
            // st.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
