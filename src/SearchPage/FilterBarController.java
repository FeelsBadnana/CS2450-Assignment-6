package SearchPage;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FilterBarController implements Initializable {

    @FXML ComboBox<String> timeBox0;
    @FXML ComboBox<String> timeBox1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeBox0.getItems().addAll("AM", "PM");
        timeBox0.getSelectionModel().select(0);

        timeBox1.getItems().addAll("AM", "PM");
        timeBox1.getSelectionModel().select(1);
    }
}
