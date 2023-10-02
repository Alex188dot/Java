package Swing_Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Login extends JFrame {

    public Login()  {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel label = new JLabel("Email: ");
        JTextField field = new JTextField();
        field.setColumns(15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(label, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(field, gbc);

        JLabel label2 = new JLabel("Password: ");
        JPasswordField field2 = new JPasswordField();
        field2.setColumns(15);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(label2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(field2, gbc);

        JLabel label3 = new JLabel("");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(label3, gbc);

        JButton button = new JButton("Login");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = field.getText();
                String password = field2.getText();

                try {
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM admins WHERE email = '"+email+"' AND pwd = '"+md5(password)+"';");
                    if (rs.next()) {
                        System.out.println("Login successful");
                        label3.setText("Login successful");
                        field.setText("");
                        field2.setText("");
                    } else {
                        System.out.println("Wrong email or password");
                        label3.setText("Wrong email or password");
                    }

                } catch (SQLException event) {
                    System.out.println("Connection failed");
                    throw new RuntimeException(event);
                }
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(button, gbc);

        JButton closeButton = new JButton("Exit");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                System.out.println("Successfully logged out");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(closeButton, gbc);

        getContentPane().add(panel);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Login window = new Login();
        window.setVisible(true);
    }

    public static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hash = no.toString(16);
            while (hash.length() < 32) {
                hash = "0" + hash;
            }
            return hash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}