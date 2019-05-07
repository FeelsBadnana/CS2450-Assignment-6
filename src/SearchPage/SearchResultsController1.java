package SearchPage;

import MainPage.classSchedule;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchResultsController1 implements Initializable {

    @FXML private TableView<classSchedule> tableView1;
    @FXML private TableColumn<classSchedule, CheckBox> column8;
    @FXML private TableColumn<classSchedule, String> column9;
    @FXML private TableColumn<classSchedule, String> column10;
    @FXML private TableColumn<classSchedule, String> column11;
    @FXML private TableColumn<classSchedule, String> column12;
    @FXML private TableColumn<classSchedule, String> column13;
    @FXML private TableColumn<classSchedule, String> column14;
    @FXML private TableColumn<classSchedule, String> column15;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        column8.setCellValueFactory(new PropertyValueFactory<>("select"));
        column9.setCellValueFactory(new PropertyValueFactory<>("sectionNum"));
        column10.setCellValueFactory(new PropertyValueFactory<>("dayTime"));
        column11.setCellValueFactory(new PropertyValueFactory<>("instructor"));
        column12.setCellValueFactory(new PropertyValueFactory<>("room"));
        column13.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        column14.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        column15.setCellValueFactory(new PropertyValueFactory<>("unit"));

        tableView1.setItems(getCS4800());
    }

    private ObservableList<classSchedule> getCS4800() {
        ObservableList<classSchedule> classList = FXCollections.observableArrayList();
        classList.addAll(new classSchedule("Software Engineering", "LECTURE-1 (12345)", "TueThu 12:00PM-2PM", "Ben Steichen",
                        "8-2324", "8/23/2019", "12/15/2019", "3 units"),
                        new classSchedule("Software Engineering","LECTURE-2 (23456)", "MonWed 5:00PM-7:45PM", "John Smith",
                        "8-3745", "8/23/2019", "12/15/2019", "3 units"),
                        new classSchedule("Software Engineering","LECTURE-3 (34567)", "MonWedFri 1:23PM-4:56PM", "Mellisa Wang",
                        "3-1723", "8/23/2019", "12/15/2019", "3 units"));

        return classList;

    }
}