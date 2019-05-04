import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.text.Font;

public class TopBar
{

  public HBox getTopBar()
  {
    //Home Button
    Image homeImage = new Image("file:Images/home.png");
    ImageView homeButton = new ImageView(homeImage);
    homeButton.setFitHeight(100);
    homeButton.setPreserveRatio(true);
    homeButton.setPickOnBounds(true);

    homeButton.setOnMouseClicked((MouseEvent e) -> {
            //task.primaryStage.setScene(task.primaryScene);
    });


    //Search Bar
    Label searchLabel = new Label("Search");
    searchLabel.setFont(new Font(30));

    TextField searchField = new TextField();
    Image searchImage = new Image("file:Images/search.png");
    ImageView searchButton = new ImageView(searchImage);
    searchButton.setFitHeight(100);
    searchButton.setPreserveRatio(true);
    searchButton.setPickOnBounds(true);

    searchButton.setOnMouseClicked((MouseEvent e) -> {
            //Search will happen here
    });


    //Additional Search Criteria
    Label subjectLabel = new Label("Subject");
    Label courseNumLabel = new Label("Course #");
    Label instructorLabel = new Label("Instructor");

    ComboBox<String> subjectBox = new ComboBox<>();
    ComboBox<String> courseNumBox = new ComboBox<>();
    ComboBox<String> instructorBox = new ComboBox<>();

    subjectBox.setValue("Select");
    courseNumBox.setValue("Select");
    instructorBox.setValue("Select");


    //Cart
    Image cartImage = new Image("file:Images/cart.png");
    ImageView cartButton = new ImageView(cartImage);
    cartButton.setFitHeight(100);
    cartButton.setPreserveRatio(true);
    cartButton.setPickOnBounds(true);

    cartButton.setOnMouseClicked((MouseEvent e) -> {
            //Search will happen here
    });

    //Organizing Nodes
    HBox mainSearch = new HBox(searchLabel, searchField, searchButton);
    HBox addSearch = new HBox(subjectLabel, subjectBox, courseNumLabel, courseNumBox, instructorLabel, instructorBox);
    VBox wholeSearch = new VBox(mainSearch, addSearch);

    HBox wholeBar = new HBox(homeButton, wholeSearch, cartButton);

    return wholeBar;
  }
}
