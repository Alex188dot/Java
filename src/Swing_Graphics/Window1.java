package Swing_Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Window1 extends JFrame {
    private final JPanel mainPanel;
    private final JPanel homePanel;
    private final JPanel usersPanel;
    private final JPanel adminsPanel;

    public Window1(String name, String lastName, int id) {
        setTitle("HR Management Platform");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());

        JPanel buttonsPanel = new JPanel(new FlowLayout());

        JButton homeButton = new JButton("Home");
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToPanel(homePanel);
            }
        });
        buttonsPanel.add(homeButton);

        JButton usersButton = new JButton("Users");
        usersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToPanel(usersPanel);
            }
        });
        buttonsPanel.add(usersButton);

        JButton adminsButton = new JButton("Admins");
        adminsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToPanel(adminsPanel);
            }
        });
        buttonsPanel.add(adminsButton);



        homePanel = new JPanel();
        homePanel.setBackground(Color.WHITE);
        JLabel welcomeLabel = new JLabel("Welcome, " + name + " " + lastName);

        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.BLACK);

        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        homePanel.add(welcomeLabel);

        JButton insertButton = new JButton("Insert employee");
        JButton updateButton = new JButton("Update employee details");

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEmployee addEmployeeWindow = new AddEmployee();
                addEmployeeWindow.setVisible(true);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateEmployee updateEmployeeWindow = new UpdateEmployee();
                updateEmployeeWindow.setVisible(true);
            }
        });

        homePanel.add(insertButton);
        homePanel.add(updateButton);

        mainPanel.add(homePanel, BorderLayout.CENTER);


        usersPanel = new JPanel(new GridLayout(0, 6)); // 6 columns
        usersPanel.setBackground(Color.WHITE);
        mainPanel.add(usersPanel, BorderLayout.CENTER);

        adminsPanel = new JPanel(new GridLayout(0, 4));
        adminsPanel.setBackground(Color.WHITE);
        mainPanel.add(adminsPanel, BorderLayout.CENTER);

        mainPanel.add(buttonsPanel, BorderLayout.NORTH);

        setContentPane(mainPanel);

        switchToPanel(homePanel);

        setLocationRelativeTo(null);
        setVisible(true);

        // Users Panel

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT users.id, users.name, users.lastname, users.city, users.age, offices.name AS office_name FROM users JOIN offices ON users.office_id = offices.id");

            JLabel idLabel = new JLabel("ID");
            JLabel nameLabel = new JLabel("Name");
            JLabel lastNameLabel = new JLabel("Lastname");
            JLabel cityLabel = new JLabel("City");
            JLabel ageLabel = new JLabel("Age");
            JLabel officeLabel = new JLabel("Office");

            usersPanel.add(idLabel);
            usersPanel.add(nameLabel);
            usersPanel.add(lastNameLabel);
            usersPanel.add(cityLabel);
            usersPanel.add(ageLabel);
            usersPanel.add(officeLabel);

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = capitalizeFirstLetter(resultSet.getString("name"));
                lastName = capitalizeFirstLetter(resultSet.getString("lastname"));
                String city = capitalizeFirstLetter(resultSet.getString("city"));
                int age = resultSet.getInt("age");
                String officeName = capitalizeFirstLetter(resultSet.getString("office_name"));

                idLabel = new JLabel(String.valueOf(id));
                nameLabel = new JLabel(name);
                lastNameLabel = new JLabel(lastName);
                cityLabel = new JLabel(city);
                ageLabel = new JLabel(String.valueOf(age));
                JLabel officeDataLabel = new JLabel(officeName);

                usersPanel.add(idLabel);
                usersPanel.add(nameLabel);
                usersPanel.add(lastNameLabel);
                usersPanel.add(cityLabel);
                usersPanel.add(ageLabel);
                usersPanel.add(officeDataLabel);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        // Admin panel

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, name, lastname, email FROM admins");

            JLabel idLabel = new JLabel("ID");
            JLabel nameLabel = new JLabel("Name");
            JLabel lastNameLabel = new JLabel("Lastname");
            JLabel emailLabel = new JLabel("Email");

            adminsPanel.add(idLabel);
            adminsPanel.add(nameLabel);
            adminsPanel.add(lastNameLabel);
            adminsPanel.add(emailLabel);

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = capitalizeFirstLetter(resultSet.getString("name"));
                lastName = capitalizeFirstLetter(resultSet.getString("lastname"));
                String email = resultSet.getString("email");

                JLabel idDataLabel = new JLabel(String.valueOf(id));
                JLabel nameDataLabel = new JLabel(name);
                JLabel lastNameDataLabel = new JLabel(lastName);
                JLabel emailDataLabel = new JLabel(email);

                adminsPanel.add(idDataLabel);
                adminsPanel.add(nameDataLabel);
                adminsPanel.add(lastNameDataLabel);
                adminsPanel.add(emailDataLabel);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



    private String capitalizeFirstLetter(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    private void switchToPanel(JPanel panel) {
        mainPanel.remove(homePanel);
        mainPanel.remove(usersPanel);
        mainPanel.remove(adminsPanel);
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Login loginWindow = new Login();
        loginWindow.setVisible(true);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window1("", "", 0);
            }


        });
    }}
