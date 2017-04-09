import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Gui_first extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("WiFi Social");

        ImageView background = new ImageView("images/wifi1.jpg");
        Button btn = new Button("login with Facebook");
        btn.setOnAction(e -> Gui_login.setScene(primaryStage));

        StackPane root = new StackPane();
        root.getChildren().add(background);
        root.getChildren().add(btn);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();

        loadSongs(); // Inicializa la Rockola
    }

    public static void main(String[] args) {
        launch(args);
    }

    static void loadSongs() {
        MusicDB db = MusicDB.getInstance();
        db.loadSong(new Music("Chinga tu madre", "Molotov", "¿Dónde jugarán las niñas?", "Rock"));
        db.loadSong(new Music("Gimma tha power", "Molotov", "¿Dónde jugarán las niñas?", "Rock"));
        db.loadSong(new Music("Highway To Hell", "AC/DC", "Highway To Hell", "Heavy Metal"));
        db.loadSong(new Music("Back in Black", "AC/DC", "Back in Black", "Heavy Metal"));
        db.loadSong(new Music("Crazy", "Aerosmith", "Get a Grip", "Hard Rock"));
        db.loadSong(new Music("Janie's Got a Gun", "Aerosmith", "Pump", "Hard Rock"));
        db.loadSong(new Music("Like a Stone", "Audioslave", "Audioslave", "Rock Alternativo"));
        db.loadSong(new Music("Be Yourself", "Audioslave", "Out of Exile", "Rock Alternativo"));
        db.loadSong(new Music("Rhymin & Stealin", "Beasty Boys", "Licenced to III", "Hip Hop"));
        db.loadSong(new Music("Get it Together", "Beasty Boys", "III Comunnication", "Hip Hop"));
        db.loadSong(new Music("Perro amor explota", "Bersuit Vergarabat", "De La Cabeza Con Bersuit Vergarabat", "Rock"));
        db.loadSong(new Music("Sdb. Cobranza", "Bersuit vergarabat", "Libertinaje", "Rock"));
        db.loadSong(new Music("Sun Is Shining", "Kaya", "Bob Marley", "Reggae"));
        db.loadSong(new Music("One Love", "Bob Marley", "Bob Marley and Wailers", "Reggae"));
        db.loadSong(new Music("Demoliendo Hoteles", "Charly García", "Piano Bar", "Rock"));
        db.loadSong(new Music("Yendo de la cama al living", "Charly García", "Yendo de la cama al living", "Rock"));
        db.loadSong(new Music("Enjoy The Silence", "Depeche Mode", "Violator", "Rock Electrónico"));
        db.loadSong(new Music("Personal Jesus", "Depeche Mode", "Violator", "Rock Electrónico"));
        db.loadSong(new Music("Smells Like Teen Spirit", "Nirvana", "Nevermind", "Grunge"));
        db.loadSong(new Music("Lithium", "Nirvana", "Nevermind", "Grunge"));
        db.loadSong(new Music("Pet Sematary", "The Ramones", "Brain drain", "Punk Rock"));
        db.loadSong(new Music("Poison Heart", "The Ramones", "Mondo Bizarro", "Punk Rock"));
        db.loadSong(new Music("Molinos de Viento", "Mägo de Oz", "La leyenda de La Mancha", "Folk Metal"));
        db.loadSong(new Music("La danza del fuego", "Mägo de Oz", "Finisterra", "Folk Metal"));
        db.loadSong(new Music("Smooth Criminal", "Michael Jackson", "Bad", "Pop"));
        db.loadSong(new Music("Bad", "Michael Jackson", "Bad", "Pop"));
        db.loadSong(new Music("When The Saints Go Marching In", "Louis Amstrong", "Single", "Jazz"));
        db.loadSong(new Music("Cheek To Cheek", "Ella Fitzgerald & Louis Amstrong", "Single", "Jazz"));
        db.loadSong(new Music("Sweet Little Angel (Live)", "B.B. King", "Single", "Blues"));
        db.loadSong(new Music("Hit The Road Jack (Original)", "Ray Charles", "Single", "Blues"));
    }
}
