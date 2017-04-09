import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_bienvenido {

    public static void setScene(Stage primaryStage) {
        primaryStage.setTitle("Bienvenido a Patagonia");

        ImageView background = new ImageView("images/wifi2.jpg");
        Button btn = new Button("login");

        //~ btn.setOnAction(e -> );//TODO

        StackPane root = new StackPane();
        root.getChildren().addAll(background, btn);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
