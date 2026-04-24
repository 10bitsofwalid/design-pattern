package StatePattern01;

public class Main {
    public static void main(String[] args) {
        MusicPlayerContext player = new MusicPlayerContext();

        // Initial state is stopped
        System.out.println("Initial state: " + player.getCurrentState().getName());

        // Start playing
        player.play(); // Outputs: Starting music. Transitioning from Stopped State to Playing State

        // Try to play again
        player.play(); // Outputs: Already playing.

        // Pause
        player.pause(); // Outputs: Pausing music. Transitioning from Playing State to Paused State

        // Resume
        player.play(); // Outputs: Resuming music. Transitioning from Paused State to Playing State

        // Stop
        player.stop(); // Outputs: Stopping music. Transitioning from Playing State to Stopped State
    }
}
