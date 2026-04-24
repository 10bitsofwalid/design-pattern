package StatePattern01;

public class PausedState implements State {
    @Override
    public void play(MusicPlayerContext context) {
        System.out.println("Resuming music.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayerContext context) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MusicPlayerContext context) {
        System.out.println("Stopping music.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Paused State";
    }
}