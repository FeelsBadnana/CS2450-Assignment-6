import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class TopBarController implements Initializable {

    @FXML private ImageView home;
    @FXML private ImageView search;
    @FXML private ImageView cart;
    @FXML private TextField searchBar;
    @FXML private ComboBox<String> subjectBox;
    @FXML private ComboBox<String> numberBox;
    @FXML private ComboBox<String> instructorBox;
    @FXML private Label subjectLabel;
    @FXML private Label numberLabel;
    @FXML private Label instructorLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
