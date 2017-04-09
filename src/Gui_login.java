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
        textField.setMaxWidth(200);

        btn.setOnAction(e -> {
            try {
                WiFiSocial.getInstance().login(textField.getText());
                Gui_bienvenido.setScene(primaryStage);
            } catch (UnregisteredUserException ex) {
                textField.setText("error: not a user");
            }
        });

        VBox loginForm = new VBox(textField, btn);
        StackPane root = new StackPane(background, loginForm);
        Scene scene = new Scene(root);

        loginForm.setAlignment(javafx.geometry.Pos.CENTER);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
