package DBManagement;

import java.sql.*;
import java.util.Scanner;

/*
  Create an HR Management Software. The software will ask the user to:

    1) Insert a new employee
    2) Insert a new office
    3) View the employees who work in an office
    4) View the office an employee works in

 */


public class Exercise2 {
    public static void main(String[] args) throws SQLException {


        Scanner in = new Scanner(System.in);

            int choice = 0;

            System.out.println("Welcome to the HR Management Platform");

            do {
                System.out.println("Please indicate whether you would like to: \n1) Insert a new employee\n2) Insert a new office\n3) View the employees who work in an office\n4) View the office an employee works in\n0) Exit");
                choice = in.nextInt();
                in.nextLine();
                if (choice < 0 || choice > 4) {
                    System.out.println("Please enter a valid choice");
                } else if (choice == 1) {
                    System.out.println("Please insert the name of the employee: ");
                    String name = in.nextLine();
                    System.out.println("Please insert the lastname of the employee: ");
                    String lastname = in.nextLine();
                    System.out.println("Please insert the city of the employee: ");
                    String city = in.nextLine();
                    System.out.println("Please insert the age of the employee: ");
                    int age = in.nextInt();
                    in.nextLine();
                    System.out.println("Please insert the office of the employee:\n1) Administration\n3) IT\n4) Marketing\n5) Sales\n6) Customer Service\n7) Software Development");
                    int office = in.nextInt();
                    in.nextLine();
                    System.out.println(insertIntoUsers(name, lastname, city, age, office));
                } else if (choice == 2) {
                    System.out.println("Please insert the name of the office you would like to add: ");
                    String name = in.nextLine();
                    System.out.println("Please insert the floor of the office: ");
                    int floor = in.nextInt();
                    in.nextLine();
                    System.out.println("Please insert the room of the office: ");
                    String room = in.nextLine();
                    System.out.println("Please insert the apartment number of the office: ");
                    int apt_number = in.nextInt();
                    in.nextLine();
                    System.out.println(insertIntoOffices(name, floor, room, apt_number));
                } else if (choice == 3) {
                    System.out.println("Please insert the number corresponding to the office you would like to view: \n1) Administration\n3) IT\n4) Marketing\n5) Sales\n6) Customer Service\n7) Software Development");
                    int id = in.nextInt();
                    in.nextLine();
                    System.out.println(viewEmployees(id));
                } else if (choice == 4) {
                    System.out.println("Please insert the lastname of the employee you would like to view the office they work in: ");
                    String lastname = in.nextLine();
                    System.out.println(viewOffice(lastname));
                }
            } while (choice != 0);



        }

    public static String insertIntoUsers(String name, String lastname, String city, int age, int office) throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement st = connect.createStatement();
            st.executeUpdate("INSERT INTO users VALUES(null,'"+name+"', '"+lastname+"', '"+city+"', "+age+", "+office+")");
            return "Employee inserted";
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
    }

    public static String insertIntoOffices(String name, int floor, String room, int apt_number) throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement st = connect.createStatement();
            st.executeUpdate("INSERT INTO offices VALUES(null,'"+name+"', "+floor+", '"+room+"', "+apt_number+")");
            return "Office inserted";
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
    }

    public static String viewEmployees(int id) throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE office_id = "+ id +" ");
            if (rs.next()) {
                do {
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Lastname: " + rs.getString("lastname"));
                    System.out.println("City: " + rs.getString("city"));
                    System.out.println("Age: " + rs.getInt("age"));
                    System.out.println("------------------");
                } while (rs.next());
                return "----------------";
            } else {
                return "Office not found";
            }
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
    }


    public static String viewOffice(String lastname) throws SQLException {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE lastname = '"+lastname+"' ");
            if (rs.next()) {
                do {
                    int office_id = rs.getInt("office_id");
                    String office_name = "";
                    if (office_id == 1) {
                        office_name = "Administration";
                    } else if (office_id == 3) {
                        office_name = "IT";
                    } else if (office_id == 4) {
                        office_name = "Marketing";
                    } else if (office_id == 5) {
                        office_name = "Sales";
                    } else if (office_id == 6) {
                        office_name = "Customer Service";
                    } else if (office_id == 7) {
                        office_name = "Software Development";
                    }
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Lastname: " + rs.getString("lastname"));
                    System.out.println("Office: " + office_name);
                    System.out.println("----------------");
                } while (rs.next());
                return "----------------";
            } else {
                return "Office not found";
            }
        } catch (SQLException e) {
            System.out.println("Connection failed");
            throw new RuntimeException(e);
        }
    }
}




