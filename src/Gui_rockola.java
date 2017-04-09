import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_rockola {
    static TextField searchbar;

    public static void setScene(Stage primaryStage) {
        primaryStage.setTitle("Rockola Patagonia");

        searchbar = new TextField("buscar");
        Button btn = new Button("S");

        btn.setOnAction(e ->
                    Gui_searchResults.setScene(primaryStage, getQuery()));

        Pane searchbox = new HBox(searchbar, btn);
        Pane currentTrack = getCurrentTrackPane();
        Pane root = new VBox(searchbox, currentTrack);
        Scene scene = new Scene(root, 240, 450);

        root.setPadding(new javafx.geometry.Insets(30));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static Pane getCurrentTrackPane() {
        Music song = Rockola.getInstance().getCurrentlyPlaying();
        Label l1 = new Label("Estas escuchando:");
        Label track = new Label(song.track);
        Label artist = new Label(song.artist);
        Label album = new Label(song.album);
        Label genero = new Label(song.genero);
        return new VBox(l1, track, artist, album, genero);
    }

    static String getQuery() {
        return searchbar.getText();
    }
}
