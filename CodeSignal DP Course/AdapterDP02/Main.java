package AdapterDP02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of VLCPlayer
        // TODO: Create an instance of MediaPlayerAdapter, passing the VLCPlayer instance to it
        // Use the adapter to play audio files
        
        VLCPlayer vlcPlayer = new VLCPlayer();

        MediaPlayer mediaPlayer = new MediaPlayerAdapter(vlcPlayer);

        mediaPlayer.playAudio("song.mp3");
        mediaPlayer.playAudio("podcast.mp3");
        mediaPlayer.playAudio("audiobook.mp3");

    }
}