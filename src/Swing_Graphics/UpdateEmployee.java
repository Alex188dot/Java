package Swing_Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class UpdateEmployee extends JFrame {
    public UpdateEmployee() {
        setTitle("Update employee");

        setSize(400, 300);



        JLabel label = new JLabel("Name: ");
        JTextField field = new JTextField();
        field.setColumns(15);
        JLabel label2 = new JLabel("Lastname: ");
        JTextField field2 = new JTextField();
        field2.setColumns(15);
        JLabel label3 = new JLabel("City: ");
        JTextField field3 = new JTextField();
        field3.setColumns(15);
        JLabel label4 = new JLabel("Age: ");
        JTextField field4 = new JTextField();
        field4.setColumns(15);
        JLabel label5 = new JLabel("Office: ");
        JTextField field5 = new JTextField();
        field5.setColumns(15);
        JLabel label6 = new JLabel("ID: ");
        JTextField field6 = new JTextField();
        field6.setColumns(15);


        JButton button = new JButton("Search user");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
                    int id = Integer.parseInt(field6.getText());
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM `users` WHERE id = " + id + ";");
                    if (rs.next()) {
                        do {
                            field.setText(rs.getString("name"));
                            field2.setText(rs.getString("lastname"));
                            field3.setText(rs.getString("city"));
                            field4.setText(rs.getString("age"));
                            field5.setText(rs.getString("office_id"));
                        } while (rs.next());
                    } else {
                        System.out.println("User not found");
                    }
                } catch (SQLException event) {
                    System.out.println("Connection failed");
                    throw new RuntimeException(event);
                }
            }
        });


        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(6, 2));
        panel.add(label);
        panel.add(field);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(label4);
        panel.add(field4);
        panel.add(label5);
        panel.add(field5);
        panel.add(label6);
        panel.add(field6);

        JButton updateButton = new JButton("Update");

        /*
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = field.getText();
                String lastname = field2.getText();
                String city = field3.getText();
                int age = Integer.parseInt(field4.getText());
                int office = Integer.parseInt(field5.getText());
                int id = Integer.parseInt(field6.getText());

                try {
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
                    Statement st = connect.createStatement();
                    st.executeUpdate("UPDATE `users` SET `name` = '" + name + "', `lastname` = '" + lastname + "', `city` = '" + city + "', `age` = " + age + ", `office_id` = " + office + " WHERE `id` = " + id + ";");
                    System.out.println("Employee updated correctly");
                    field.setText("");
                    field2.setText("");
                    field3.setText("");
                    field4.setText("");
                    field5.setText("");
                    field6.setText("");
                } catch (SQLException event) {
                    System.out.println("Connection failed");
                    throw new RuntimeException(event);
                }
            }});
         */


        // Below code that is safe and prevents SQL injections

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = field.getText();
                String lastname = field2.getText();
                String city = field3.getText();
                int age = Integer.parseInt(field4.getText());
                int office = Integer.parseInt(field5.getText());
                int id = Integer.parseInt(field6.getText());
                try {
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
                    String sql = "UPDATE `users` SET `name` = ?, `lastname` = ?, `city` = ?, `age` = ?, `office_id` = ? WHERE `id` = ?;";
                    PreparedStatement ps = connect.prepareStatement(sql);
                    ps.setString(1, name);
                    ps.setString(2, lastname);
                    ps.setString(3, city);
                    ps.setInt(4, age);
                    ps.setInt(5, office);
                    ps.setInt(6, id);
                    ps.executeUpdate();
                    System.out.println("Employee updated correctly");
                    field.setText("");
                    field2.setText("");
                    field3.setText("");
                    field4.setText("");
                    field5.setText("");
                    field6.setText("");
                } catch (SQLException event) {
                    System.out.println("Connection failed");
                    throw new RuntimeException(event);
                }
            }});



        JButton closeButton = new JButton("Exit");




        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });




        getContentPane().add(panel);
        getContentPane().add(button);
        getContentPane().add(updateButton);
        getContentPane().add(closeButton);


        getContentPane().setLayout(new java.awt.FlowLayout());

        setLocationRelativeTo(null);
    }



    public static void main(String[] args) {
        UpdateEmployee window = new UpdateEmployee();

        window.setVisible(true);
    }
}
