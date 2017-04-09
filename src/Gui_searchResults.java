import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.FXCollections;

public class Gui_searchResults {
    static TextField searchbar;

    public static void setScene(Stage primaryStage, String query) {
        primaryStage.setTitle("Rockola Patagonia");

        Button back = new Button("<--");
        Button btn = new Button("S");
        searchbar = new TextField("buscar");

        btn.setOnAction(e ->
                    Gui_searchResults.setScene(primaryStage, getQuery()));
        back.setOnAction(e -> Gui_rockola.setScene(primaryStage));

        Pane searchbox = new HBox(back, searchbar, btn);
        Pane results = new VBox(new ListView(FXCollections.observableArrayList(
                    MusicDB.getInstance().query(query))));
        Pane root = new VBox(searchbox, results);
        Scene scene = new Scene(root, 240, 450);

        root.setPadding(new javafx.geometry.Insets(30));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static String getQuery() {
        return searchbar.getText();
    }
}
