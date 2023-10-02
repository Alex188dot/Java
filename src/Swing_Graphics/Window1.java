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
        setTitle("Main Application");
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


        mainPanel.add(homePanel, BorderLayout.CENTER);


        usersPanel = new JPanel(new GridLayout(0, 6)); // 6 columns
        usersPanel.setBackground(Color.WHITE);
        mainPanel.add(usersPanel, BorderLayout.CENTER);

        adminsPanel = new JPanel();
        adminsPanel.setBackground(Color.WHITE);
        mainPanel.add(adminsPanel, BorderLayout.CENTER);

        mainPanel.add(buttonsPanel, BorderLayout.NORTH);

        setContentPane(mainPanel);

        switchToPanel(homePanel);

        setLocationRelativeTo(null);
        setVisible(true);

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                lastName = resultSet.getString("lastname");
                String city = resultSet.getString("city");
                int age = resultSet.getInt("age");
                int officeId = resultSet.getInt("office_id");

                JLabel idLabel = new JLabel(String.valueOf(id));
                JLabel nameLabel = new JLabel(name);
                JLabel lastNameLabel = new JLabel(lastName);
                JLabel cityLabel = new JLabel(city);
                JLabel ageLabel = new JLabel(String.valueOf(age));
                JLabel officeIdLabel = new JLabel(String.valueOf(officeId));

                usersPanel.add(idLabel);
                usersPanel.add(nameLabel);
                usersPanel.add(lastNameLabel);
                usersPanel.add(cityLabel);
                usersPanel.add(ageLabel);
                usersPanel.add(officeIdLabel);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
