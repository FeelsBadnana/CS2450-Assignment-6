import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.*;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import java.util.Arrays;

public class task extends Application{

  ObservableList<classSchedule> classList;
  Scene primaryScene;
  Stage primaryStage;

    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage){

        classList = FXCollections.observableArrayList();

        classList.addAll(new classSchedule("Graphical User Interface", "TueThu 8:00AM-10AM", "Ben Steichen",
                                           "8-2324", "8/23/2019", "12/15/2019", "3 units"),
                         new classSchedule("Numerical Methods", "MonWed 1:00PM-2:45PM", "John Smith",
                                           "8-3745", "8/23/2019", "12/15/2019", "3 units"),
                         new classSchedule("Software Engineering", "MonWedFri 9:00AM-10AM", "Mellisa Wang",
                                           "3-1723", "8/23/2019", "12/15/2019", "3 units"));

        TableView<classSchedule> tableView = new TableView<>();
        Button addButton = new Button("Add");
        Button dropButton = new Button("Drop");
        Button swapButton = new Button("Swap");


        TableColumn<classSchedule, Button> column0 = new TableColumn<>();
        column0.setCellValueFactory(new PropertyValueFactory<>("select"));

        TableColumn<classSchedule, String> column1 = new TableColumn<>("Class");
        column1.setCellValueFactory(new PropertyValueFactory<>("className"));


        TableColumn<classSchedule, String> column2 = new TableColumn<>("Day/Times");
        column2.setCellValueFactory(new PropertyValueFactory<>("dayTime"));

        TableColumn<classSchedule, String> column3 = new TableColumn<>("Instructor");
        column3.setCellValueFactory(new PropertyValueFactory<>("instructor"));

        TableColumn<classSchedule, String> column4 = new TableColumn<>("Room");
        column4.setCellValueFactory(new PropertyValueFactory<>("room"));

        TableColumn<classSchedule, String> column5 = new TableColumn<>("Start Date");
        column5.setCellValueFactory(new PropertyValueFactory<>("startDate"));

        TableColumn<classSchedule, String> column6 = new TableColumn<>("End Date");
        column6.setCellValueFactory(new PropertyValueFactory<>("endDate"));

        TableColumn<classSchedule, String> column7 = new TableColumn<>("Units");
        column7.setCellValueFactory(new PropertyValueFactory<>("unit"));

        tableView.setEditable(true);
        tableView.setPrefWidth(950);
        column0.setPrefWidth(50);
        column1.setPrefWidth(200);
        column2.setPrefWidth(200);
        column3.setPrefWidth(100);
        column4.setPrefWidth(100);
        column5.setPrefWidth(100);
        column6.setPrefWidth(100);
        column7.setPrefWidth(100);

        tableView.getColumns().addAll(Arrays.asList(column0, column1, column2, column3, column4, column5, column6, column7));

        tableView.getItems().addAll(classList);

        HBox hbox = new HBox(addButton, dropButton, swapButton);
        addButton.setPadding(new Insets(10));
        dropButton.setPadding(new Insets(10));
        swapButton.setPadding(new Insets(10));

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(tableView);
        borderPane.setBottom(hbox);

        //TopBar part
        borderPane.setTop(new TopBar().getTopBar());

        primaryScene = new Scene(borderPane, 950, 400);
        primaryStage.setScene(primaryScene);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("CPP Broncodirect");
        primaryStage.show();

        this.primaryStage = primaryStage;
    }

}
