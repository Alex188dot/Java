package Swing_Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Swing Window Example");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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



        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(field.getText());
            }
        });

        // Create a panel to hold the labels and fields
        JPanel panel = new JPanel();
        // Use a grid layout with two columns and four rows
        panel.setLayout(new java.awt.GridLayout(4, 2));
        // Add the components to the panel
        panel.add(label);
        panel.add(field);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(field3);
        panel.add(label4);
        panel.add(field4);

        // Add the panel and the button to the content pane
        getContentPane().add(panel);
        getContentPane().add(button);

        // Use a flow layout for the content pane
        getContentPane().setLayout(new java.awt.FlowLayout());

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MyWindow window = new MyWindow();

        window.setVisible(true);
    }
}
