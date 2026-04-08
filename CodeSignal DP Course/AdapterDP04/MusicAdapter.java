package AdapterDP04;

public class MusicAdapter implements MusicPlayer {
    private CDPlayer cdPlayer;

    // TODO: Complete the constructor to initialize cdPlayer
    public MusicAdapter(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    // TODO: Override the playMusic method to call playCD on cdPlayer
    @Override
    public void playMusic() {
        cdPlayer.playCD();
    }
}