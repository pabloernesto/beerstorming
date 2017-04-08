import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_first extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Queen - Somebody to Love",
                    new ImageView("images/somebodyToLove.jpg"));
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
