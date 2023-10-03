package CF;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CFController {
    @FXML
    private Label codiceFiscaleLabel;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    public void setStage(Stage stage) {

    }

    @FXML
    public void calculateButtonClicked(ActionEvent actionEvent) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String codiceFiscale = calculateCodiceFiscale(firstName, lastName);
        codiceFiscaleLabel.setText(codiceFiscale);
    }

    private String calculateCodiceFiscale(String firstName, String lastName) {
        String vowels = "AEIOU";
        String consonantsFirstName = "";
        String consonantsLastName = "";
        for (char c : firstName.toUpperCase().toCharArray()) {
            if (!vowels.contains(String.valueOf(c))) {
                consonantsFirstName += c;
            }
        }
        for (char c : lastName.toUpperCase().toCharArray()) {
            if (!vowels.contains(String.valueOf(c))) {
                consonantsLastName += c;
            }
        }
        return consonantsFirstName.substring(0, 3) + consonantsLastName.substring(0, 3);
    }
}