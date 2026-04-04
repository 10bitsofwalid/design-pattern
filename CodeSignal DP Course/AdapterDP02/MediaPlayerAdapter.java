package AdapterDP02;

// TODO: Implement the MediaPlayerAdapter class that adapts VLCPlayer to MediaPlayer interface.
public class MediaPlayerAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    // TODO: Complete the constructor to initialize the vlcPlayer object.
    public MediaPlayerAdapter(VLCPlayer vlcPlayer) {
        // Initialize vlcPlayer here
        this.vlcPlayer = vlcPlayer;
    }

    // TODO: Implement the playAudio() method to adapt the VLCPlayer method.
    @Override
    public void playAudio(String filename) {
        // Call the appropriate VLCPlayer method here
        vlcPlayer.playVLCFile(filename);
    }
}