import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_rockola {

    public static void setScene(Stage primaryStage) {
        primaryStage.setTitle("Rockola Patagonia");

        Button btn = new Button("S");
        TextField searchbar = new TextField("buscar");

        //~ btn.setOnAction(e -> );//TODO

        Pane searchbox = new HBox(searchbar, btn);
        Pane root = new VBox(searchbox);
        Scene scene = new Scene(root, 240, 450);

        root.setPadding(new javafx.geometry.Insets(30));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
