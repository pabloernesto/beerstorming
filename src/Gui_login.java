import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_login {

    public static void setScene(Stage primaryStage) {
        primaryStage.setTitle("facebook login");

        ImageView background = new ImageView("images/facebookLogo.png");
        TextField textField = new TextField("username");
        Button btn = new Button("login");

        background.setFitWidth(300);
        background.setFitHeight(300);

        btn.setOnAction(e -> Gui_bienvenido.setScene(primaryStage));

        StackPane root = new StackPane();
        root.getChildren().addAll(background, textField, btn);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
