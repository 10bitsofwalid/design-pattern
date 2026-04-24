package StatePattern01;

public class PlayingState implements State {
    @Override
    public void play(MusicPlayerContext context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MusicPlayerContext context) {
        System.out.println("Pausing music.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MusicPlayerContext context) {
        System.out.println("Stopping music.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Playing State";
    }
}
