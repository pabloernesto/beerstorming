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
        ImageView background = new ImageView("images/wifi1.jpg");

        Button btn = new Button("login with Facebook");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(background);
        root.getChildren().add(btn);

        Scene scene = new Scene(root);

        primaryStage.setTitle("WiFi Social");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
