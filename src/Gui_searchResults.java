import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.FXCollections;

public class Gui_searchResults {
    static TextField searchbar;

    public static void setScene(Stage primaryStage, String query,
                String username) {
        primaryStage.setTitle("Rockola Patagonia");

        Button back = new Button("<--");
        Button btn = new Button("S");
        searchbar = new TextField("buscar");

        btn.setOnAction(e ->
                    Gui_searchResults.setScene(primaryStage, getQuery(),
                    username));
        back.setOnAction(e -> Gui_rockola.setScene(primaryStage, username));

        Pane searchbox = new HBox(back, searchbar, btn);
        ListView results = new ListView(FXCollections.observableArrayList(
                    MusicDB.getInstance().query(query)));
        Pane resultBox = new VBox(results);
        Pane root = new VBox(searchbox, results);
        Scene scene = new Scene(root, 240, 450);

        results.setOnMouseClicked(e -> {
            Rockola.getInstance()
                .request(username,
                        (Music)results.getSelectionModel().getSelectedItem());
            Gui_rockola.setScene(primaryStage, username);
        });

        root.setPadding(new javafx.geometry.Insets(30, 5, 30, 5));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static String getQuery() {
        return searchbar.getText();
    }
}
