import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class FilterBarController implements Initializable {

    @FXML ComboBox<String> timeBox0;
    @FXML ComboBox<String> timeBox1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeBox0.getItems().addAll("AM", "PM");

        timeBox1.getItems().addAll("AM", "PM");
    }
}
