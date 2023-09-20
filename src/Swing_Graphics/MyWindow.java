package Swing_Graphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Swing Window Example");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, Swing!");
        JTextField field = new JTextField();
        field.setColumns(20);
        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(field.getText());
            }
        });


        getContentPane().add(label);
        getContentPane().add(field);
        getContentPane().add(button);

        getContentPane().setLayout(new java.awt.FlowLayout());
    }

    public static void main(String[] args) {
        MyWindow window = new MyWindow();

        window.setVisible(true);
    }
}