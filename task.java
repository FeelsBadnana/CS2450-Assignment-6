import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class task extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public class classSchedule {

        private String className = null;
        private String dayTime = null;
        private String instructor = null;
        private String room = null;
        private String startDate = null;
        private String endDate = null;
        private String unit = null;
        private CheckBox select;
    
        public classSchedule() {
        }
    
        public classSchedule(String className, String dayTime, String instructor, String room, String startDate, String endDate, String unit) {
            this.select = new CheckBox();
            this.className = className;
            this.dayTime = dayTime;
            this.instructor = instructor;
            this.room = room;
            this.startDate = startDate;
            this.endDate = endDate;
            this.unit = unit;
            
        }
    
        public CheckBox getSelect() {return select;}

        public void setSelect(CheckBox select){ this.select = select;}

        public String getClassName() {return className;}
    
        public void setClassName(String className) {this.className = className;}
    
        public String getDayTime() {return dayTime;}
    
        public void setDayTime(String dayTime) {this.dayTime = dayTime;}

        public String getInstructor() {return instructor;}

        public void setInstructor(String instructor) { this.instructor = instructor;}

        public String getRoom() {return room;}

        public void setRoom(String room) { this.room = room;}

        public String getStartDate() {return startDate;}

        public void setStartDate(String startDate) {this.startDate = startDate;}

        public String getEndDate() {return endDate;}

        public void setEndDate(String endDate) {this.endDate = endDate;}

        public String getUnit() {return unit;}

        public void setUnit(String unit) {this.unit = unit;}
    }

    @Override
    public void start(Stage primaryStage){

        TableView tableView = new TableView();
        Button addButton = new Button("Add");
        Button dropButton = new Button("Drop");
        Button swapButton = new Button("Swap");
        

        TableColumn column0 = new TableColumn();
        column0.setCellValueFactory(new PropertyValueFactory<>("select"));
        
        TableColumn<String, classSchedule> column1 = new TableColumn<>("Class");
        column1.setCellValueFactory(new PropertyValueFactory<>("className"));

        
        TableColumn<String, classSchedule> column2 = new TableColumn<>("Day/Times");
        column2.setCellValueFactory(new PropertyValueFactory<>("dayTime"));

        TableColumn<String, classSchedule> column3 = new TableColumn<>("Intructor");
        column3.setCellValueFactory(new PropertyValueFactory<>("instructor"));

        TableColumn<String, classSchedule> column4 = new TableColumn<>("Room");
        column4.setCellValueFactory(new PropertyValueFactory<>("room"));

        TableColumn<String, classSchedule> column5 = new TableColumn<>("Start Date");
        column5.setCellValueFactory(new PropertyValueFactory<>("startDate"));

        TableColumn<String, classSchedule> column6 = new TableColumn<>("End Date");
        column6.setCellValueFactory(new PropertyValueFactory<>("endDate"));

        TableColumn<String, classSchedule> column7 = new TableColumn<>("Units");
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
    
        tableView.getColumns().addAll(column0, column1, column2, column3, column4, column5, column6, column7);

        tableView.getItems().add(new classSchedule("Graphic User Interface", "TueThu 8:00AM-10AM", "Ben Steichen", 
                                                    "8-2324", "8/23/2019", "12/15/2019", "3 units"));

        tableView.getItems().add(new classSchedule("Numerical Methods", "MonWed 1:00PM-2:45PM", "John Smith", 
                                                    "8-3745", "8/23/2019", "12/15/2019", "3 units"));
        
        tableView.getItems().add(new classSchedule("Software Engineering", "MonWedFri 9:00AM-10AM", "Mellisa Wang", 
                                                    "3-1723", "8/23/2019", "12/15/2019", "3 units"));
                                                    

        HBox hbox = new HBox(addButton, dropButton, swapButton);
        addButton.setPadding(new Insets(10));
        dropButton.setPadding(new Insets(10));
        swapButton.setPadding(new Insets(10));

        
        VBox vbox = new VBox(tableView, hbox);

        GridPane gridPane = new GridPane();
        gridPane.add(vbox, 0, 0);
        gridPane.add(hbox, 0, 1);

        Scene scene = new Scene(gridPane, 950, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("CPP Broncodirect");
        primaryStage.show();
    }

}