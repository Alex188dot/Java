package DBManagement;

import java.sql.*;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");

            int choice = 0;
            System.out.println("Welcome to the Office Manager");

            do {
                System.out.println("Please indicate whether you would like to search an office by:\n1) Name\n2) Floor\n3) Room\n4) Apartment Number\n0) Exit");
                choice = in.nextInt();
                in.nextLine();
                if (choice < 0 || choice > 4) {
                    System.out.println("Please enter a valid choice");
                } else if (choice == 1) {
                    System.out.println("Please insert the name of the office: ");
                    String name = in.nextLine();
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM offices WHERE name = '" + name + "'");
                    if (rs.next()) {
                        do {
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Floor: " + rs.getString("floor"));
                            System.out.println("Room: " + rs.getString("room"));
                            System.out.println("Apartment Number: " + rs.getInt("apt_number"));
                            System.out.println("------------------");
                        } while (rs.next());
                    } else {
                        System.out.println("Office not found");
                    }
                } else if (choice == 2) {
                    System.out.println("Please insert the floor of the office: ");
                    String floor = in.nextLine();
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM offices WHERE floor = '" + floor + "'");
                    if (rs.next()) {
                        do {
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Floor: " + rs.getString("floor"));
                            System.out.println("Room: " + rs.getString("room"));
                            System.out.println("Apartment Number: " + rs.getInt("apt_number"));
                            System.out.println("------------------");
                        } while (rs.next());
                    } else {
                        System.out.println("Office not found");
                    }
                } else if (choice == 3) {
                    System.out.println("Please insert the room of the office: ");
                    String room = in.nextLine();
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM offices WHERE room = '" + room + "'");
                    if (rs.next()) {
                        do {
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Floor: " + rs.getString("floor"));
                            System.out.println("Room: " + rs.getString("room"));
                            System.out.println("Apartment Number: " + rs.getInt("apt_number"));
                            System.out.println("------------------");
                        } while (rs.next());
                    } else {
                        System.out.println("Office not found");
                    }
                } else if (choice == 4) {
                    System.out.println("Please insert the apartment number of the office: ");
                    String apt_number = in.nextLine();
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM offices WHERE apt_number = '" + apt_number + "'");
                    if (rs.next()) {
                        do {
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Floor: " + rs.getString("floor"));
                            System.out.println("Room: " + rs.getString("room"));
                            System.out.println("Apartment Number: " + rs.getInt("apt_number"));
                            System.out.println("------------------");
                        } while (rs.next());
                    } else {
                        System.out.println("Office not found");
                    }
                }
            } while (choice != 0);




        } catch (SQLException ex) {
            System.out.println("Connection failed");
            throw new RuntimeException(ex);
        }



    }
}
