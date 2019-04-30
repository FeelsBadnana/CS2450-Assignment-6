import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Main extends Application
{
  public static void main(String[] args)
  {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage)
  {
    VBox vbox = new VBox();
    Scene scene = new Scene(vbox,1000,600);
    scene.setFill(null);
    primaryStage.setScene(scene);
    primaryStage.show();


  }
}
