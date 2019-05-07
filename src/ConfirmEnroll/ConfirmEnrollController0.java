package ConfirmEnroll;

import MainPage.classSchedule;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfirmEnrollController0 implements Initializable {
    @FXML private TableView<classSchedule> tableView0;
    @FXML private TableColumn<classSchedule, String> column1;
    @FXML private TableColumn<classSchedule, String> column2;
    @FXML private TableColumn<classSchedule, String> column3;
    @FXML private TableColumn<classSchedule, String> column4;
    @FXML private TableColumn<classSchedule, String> column5;
    @FXML private TableColumn<classSchedule, String> column6;
    @FXML private TableColumn<classSchedule, String> column7;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        column1.setCellValueFactory(new PropertyValueFactory<>("className"));
        column2.setCellValueFactory(new PropertyValueFactory<>("dayTime"));
        column3.setCellValueFactory(new PropertyValueFactory<>("instructor"));
        column4.setCellValueFactory(new PropertyValueFactory<>("room"));
        column5.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        column6.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        column7.setCellValueFactory(new PropertyValueFactory<>("unit"));

        tableView0.setItems(getAddClasses());
    }

    private ObservableList<classSchedule> getAddClasses() {
        ObservableList<classSchedule> classList = FXCollections.observableArrayList();
        classList.addAll(new classSchedule("Data Structures and Advanced Programming", "LECTURE-1 (12345)", "TueThu 12:00PM-2PM", "Ben Steichen",
                        "8-2324", "8/23/2019", "12/15/2019", "3 units"),
                        new classSchedule("Software Engineering","LECTURE-2 (23456)", "MonWed 5:00PM-7:45PM", "John Smith",
                        "8-3745", "8/23/2019", "12/15/2019", "3 units"));

        return classList;
    }
}