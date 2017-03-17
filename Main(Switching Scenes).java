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

public class Main extends Application implements EventHandler<ActionEvent> {
    Stage window;
    Scene firstScene, secondScene;

    public static void main(String[] args) { launch(args);}

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        //Scene 1
        
        Label greeting = new Label("Welcome to the First Scene");
        
        Button toSceneTwo = new Button("Press here to go to the Second Scene!");
        
        toSceneTwo.setOnAction(e -> window.setScene(secondScene)); // When the button is pressed goes to the second scene
        
        VBox layout = new VBox(); //Vertical Box, a type of layout that stacks things on top of each other
        
        layout.getChildren().addAll(greeting, toSceneTwo);
        
        firstScene = new Scene(layout, 400, 400);
        
        //Scene 2
        
        Label greeting2 = new Label("Welcome to the Second Scene!");
        
        Button toSceneOne = new Button("Press here to go back to the First Scene!");
        
        toSceneOne.setOnAction(e -> window.setScene(firstScene));
        
        VBox layout2 = new VBox();
        
        layout2.getChildren().addAll(greeting2, toSceneOne);
        
        secondScene = new Scene(layout2, 400, 400);
        
        window.setScene(firstScene);
        
        window.show();

    }

    public void handle(ActionEvent event) {

    }
}
