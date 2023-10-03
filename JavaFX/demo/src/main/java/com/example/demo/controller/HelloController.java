package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    public void sum(ActionEvent actionEvent) {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());
        welcomeText.setText(String.valueOf(sum(num1, num2)));
    }

    private int sum(int a, int b) {
        return a + b;
    }
}