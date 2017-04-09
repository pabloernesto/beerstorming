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
        Rockola r = Rockola.getInstance();
        r.loadSong(new Music("Chinga tu madre", "Molotov", "¿Dónde jugarán las niñas?", "Rock"));
        r.loadSong(new Music("Gimma tha power", "Molotov", "¿Dónde jugarán las niñas?", "Rock"));
        r.loadSong(new Music("Highway To Hell", "AC/DC", "Highway To Hell", "Heavy Metal"));
        r.loadSong(new Music("Back in Black", "AC/DC", "Back in Black", "Heavy Metal"));
        r.loadSong(new Music("Crazy", "Aerosmith", "Get a Grip", "Hard Rock"));
        r.loadSong(new Music("Janie's Got a Gun", "Aerosmith", "Pump", "Hard Rock"));
        r.loadSong(new Music("Like a Stone", "Audioslave", "Audioslave", "Rock Alternativo"));
        r.loadSong(new Music("Be Yourself", "Audioslave", "Out of Exile", "Rock Alternativo"));
        r.loadSong(new Music("Rhymin & Stealin", "Beasty Boys", "Licenced to III", "Hip Hop"));
        r.loadSong(new Music("Get it Together", "Beasty Boys", "III Comunnication", "Hip Hop"));
        r.loadSong(new Music("Perro amor explota", "Bersuit Vergarabat", "De La Cabeza Con Bersuit Vergarabat", "Rock"));
        r.loadSong(new Music("Sr. Cobranza", "Bersuit vergarabat", "Libertinaje", "Rock"));
        r.loadSong(new Music("Sun Is Shining", "Kaya", "Bob Marley", "Reggae"));
        r.loadSong(new Music("One Love", "Bob Marley", "Bob Marley and Wailers", "Reggae"));
        r.loadSong(new Music("Demoliendo Hoteles", "Charly García", "Piano Bar", "Rock"));
        r.loadSong(new Music("Yendo de la cama al living", "Charly García", "Yendo de la cama al living", "Rock"));
        r.loadSong(new Music("Enjoy The Silence", "Depeche Mode", "Violator", "Rock Electrónico"));
        r.loadSong(new Music("Personal Jesus", "Depeche Mode", "Violator", "Rock Electrónico"));
        r.loadSong(new Music("Smells Like Teen Spirit", "Nirvana", "Nevermind", "Grunge"));
        r.loadSong(new Music("Lithium", "Nirvana", "Nevermind", "Grunge"));
        r.loadSong(new Music("Pet Sematary", "The Ramones", "Brain drain", "Punk Rock"));
        r.loadSong(new Music("Poison Heart", "The Ramones", "Mondo Bizarro", "Punk Rock"));
        r.loadSong(new Music("Molinos de Viento", "Mägo de Oz", "La leyenda de La Mancha", "Folk Metal"));
        r.loadSong(new Music("La danza del fuego", "Mägo de Oz", "Finisterra", "Folk Metal"));
        r.loadSong(new Music("Smooth Criminal", "Michael Jackson", "Bad", "Pop"));
        r.loadSong(new Music("Bad", "Michael Jackson", "Bad", "Pop"));
        r.loadSong(new Music("When The Saints Go Marching In", "Louis Amstrong", "Single", "Jazz"));
        r.loadSong(new Music("Cheek To Cheek", "Ella Fitzgerald & Louis Amstrong", "Single", "Jazz"));
        r.loadSong(new Music("Sweet Little Angel (Live)", "B.B. King", "Single", "Blues"));
        r.loadSong(new Music("Hit The Road Jack (Original)", "Ray Charles", "Single", "Blues"));
    }
}
