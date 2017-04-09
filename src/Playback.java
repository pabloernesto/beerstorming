public class Playback {
    Music song;
    Integer num_repr;

    public Playback(Music m) {
        song = m;
        num_repr = 0;
    }

    public void addPlayback() {
        num_repr += 1;
    }
}
