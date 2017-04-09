import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_rockola {

    public static void setScene(Stage primaryStage) {
        primaryStage.setTitle("Rockola Patagonia");

        Button btn = new Button("S");

        //~ btn.setOnAction(e -> );//TODO

        Pane root = new VBox();
        root.getChildren().addAll(btn);
        Scene scene = new Scene(root, 460, 240);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
