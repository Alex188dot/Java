/*
This is an Italian Codice Fiscale (Tax ID) application which will return
the first 6 digits of someone's CF if you insert the name and lastname
 */
package CF;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CFApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("cf-view.fxml"));
        Parent root = fxmlLoader.load();

        CFController controller = fxmlLoader.getController();
        controller.setStage(stage);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("CF Application");
        stage.show();
    }
}