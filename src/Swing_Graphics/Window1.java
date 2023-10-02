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

public class Window1 extends JFrame {

    public Window1(String name, String lastName, int id) {
        setTitle("Main Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel greetingLabel = new JLabel("Welcome, " + name + " " + lastName);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(greetingLabel, gbc);

        setLocationRelativeTo(null);
        getContentPane().add(panel);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Login loginWindow = new Login();
        loginWindow.setVisible(true);

        Window1 mainApplicationWindow = new Window1("John", "Doe", 1);
        mainApplicationWindow.setVisible(true);
    }
}