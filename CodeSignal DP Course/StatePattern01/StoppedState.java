package StatePattern01;

public class StoppedState implements State {
    @Override
    public void play(MusicPlayerContext context) {
        System.out.println("Starting music.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MusicPlayerContext context) {
        System.out.println("Can't pause when stopped.");
    }

    @Override
    public void stop(MusicPlayerContext context) {
        System.out.println("Already stopped.");
    }

    @Override
    public String getName() {
        return "Stopped State";
    }
}
