package StatePattern02;

// TODO: Implement the PlayingState class that handles all state transitions and appropriate messages

public class PlayingState implements State {
    @Override
    public void play(TVContext context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Pausing TV.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Stopping TV.");
        context.setState(new StoppedState());
    }

    @Override
    public String getName() {
        return "Playing State";
    }
}