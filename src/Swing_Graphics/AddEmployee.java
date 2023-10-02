package Swing_Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class AddEmployee extends JFrame {

    public AddEmployee() {
        setTitle("Add employee");

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



        JButton button = new JButton("Insert user");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = field.getText();
                String lastname = field2.getText();
                String city = field3.getText();
                int age = Integer.parseInt(field4.getText());
                int office = Integer.parseInt(field5.getText());

                try {
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
                    Statement st = connect.createStatement();
                    st.executeUpdate("INSERT INTO users VALUES(null,'"+name+"', '"+lastname+"', '"+city+"', "+age+", "+office+")");
                    System.out.println("Employee inserted correctly");
                    field.setText("");
                    field2.setText("");
                    field3.setText("");
                    field4.setText("");
                    field5.setText("");
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


        JButton closeButton = new JButton("Exit");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });




        getContentPane().add(panel);
        getContentPane().add(button);
        getContentPane().add(closeButton);

        getContentPane().setLayout(new java.awt.FlowLayout());

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        AddEmployee window = new AddEmployee();

        window.setVisible(true);
    }
}
