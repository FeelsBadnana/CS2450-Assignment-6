import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class classSchedule {

    @FXML
    private String className = null;
    private String dayTime = null;
    private String instructor = null;
    private String room = null;
    private String startDate = null;
    private String endDate = null;
    private String unit = null;
    private CheckBox select;


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
