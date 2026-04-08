package AdapterDP04;

public class Main {
    public static void main(String[] args) {
        // TODO: Complete the code to create an instance of CDPlayer
        CDPlayer cdPlayer = new CDPlayer();

        // TODO: Complete the code to create an instance of MusicAdapter passing
        // cdPlayer to it
        MusicPlayer adapter = new MusicAdapter(cdPlayer);

        // TODO: Complete the code to use the adapter to play music
        adapter.playMusic(); // Outputs: Playing music from CD.
    }
}