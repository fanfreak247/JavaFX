/* Basic JavaFX GUI
By FanFreak247
 */



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {
    public static void main(String[] args){
        launch(args); //Calls public void start
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
          //Stage is the window!
        primaryStage.setTitle("Example GUI"); // Sets Title on Top Left of Window!
        
        Button printHello = new Button("Click Me to Print Hello"); // Creates a Button that has the String Argument
        
        printHello.setOnAction(e -> System.out.println("Hello")); // When pressed, the button printHello will print Hello to the console (using lambda function(
        
        StackPane layout = new StackPane(); // Is layout for the Window!
        
        layout.getChildren().add(printHello); //Adds Button to the Layout
        
        Scene scene = new Scene(layout, 200, 200); //The content inside the Window, takes layout and the height and width arguments of window on startup
        
        primaryStage.setScene(scene); //Sets the Scene to the Window
        primaryStage.show();
        }

}
