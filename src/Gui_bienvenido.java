import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_bienvenido {

    public static void setScene(Stage primaryStage) {
        primaryStage.setTitle("Bienvenido a Patagonia");

        ImageView background = new ImageView("images/wifi2.jpg");
        ImageView rockola = new ImageView("images/rockola.jpg");
        Button btn = new Button("", rockola);

        btn.setOnAction(e -> Gui_rockola.setScene(primaryStage));
        rockola.setFitWidth(150);
        rockola.setFitHeight(100);

        StackPane root = new StackPane();
        root.getChildren().addAll(background, btn);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
