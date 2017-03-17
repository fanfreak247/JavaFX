/* Basic JavaFX GUI
By FanFreak247
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button printHello; //call the button here so that the public void handle will be able to recognize it
    
    public static void main(String[] args){
        launch(args); //Calls public void start

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
          //Stage is the window!
        
        primaryStage.setTitle("Example GUI"); // Sets Title on Top Left of Window!
        
        printHello = new Button("Click Me to Print Hello"); // Creates a Button that has the String Argument
        
        printHello.setOnAction(this); // When pressed, the button will call the public void display method in the class
        
        StackPane layout = new StackPane(); // Is layout for the Window!
        
        layout.getChildren().add(printHello); //Adds Button to the Layout
        
        Scene scene = new Scene(layout, 200, 200); //The content inside the Window, takes layout and the height and width arguments of window on startup
        
        primaryStage.setScene(scene); //Sets the Scene to the Window
        
        primaryStage.show();
        }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == printHello) { // If the button printHello was pressed:
            System.out.println("Hello");
        }
    }
}
