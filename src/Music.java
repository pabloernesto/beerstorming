
public class Music {
    String track;
    String artist;
    String album;
    String genero;

    public Music(String track, String artist, String album, String genero) {
        this.track = track;
        this.artist = artist;
        this.album = album;
        this.genero = genero;
    }

    public boolean matches(String query) {
        String q = query.trim().toLowerCase();
        if (track.toLowerCase().indexOf(q) != -1 ||
                    artist.toLowerCase().indexOf(q) != -1 ||
                    album.toLowerCase().indexOf(q) != -1 ||
                    genero.toLowerCase().indexOf(q) != -1)
            return true;
        else
            return false;
    }

    public String toString() {
        return track + "\n" + artist + " - " + album + "\n" + genero;
    }
}
