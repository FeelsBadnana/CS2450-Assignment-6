import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
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
    @FXML Controller mainController;

    public void injectMainController(Controller controller)
    {
        this.mainController = controller;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        subjectBox.getItems().addAll("CS", "ENG", "MAT");

        numberBox.getItems().addAll("2400", "3310", "4800");

        instructorBox.getItems().addAll("B. Steichen", "is", "awesome");
    }

    public void searchButtonPushed(MouseEvent event) throws IOException
    {
        /*FXMLLoader loader = FXMLLoader.load(getClass().getResource("SearchResults.fxml"));
        searchBar.getScene().setRoot(loader.getRoot());*/
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("SearchResults.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void homeButtonPushed(MouseEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void cartButtonPushed(MouseEvent event) throws IOException
    {

    }
}
