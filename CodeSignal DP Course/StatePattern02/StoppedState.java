package StatePattern02;

// TODO: Implement the StoppedState class that handles all state transitions and appropriate messages

public class StoppedState implements State {
    @Override
    public void play(TVContext context) {
        System.out.println("Starting TV.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(TVContext context) {
        System.out.println("Can't pause when stopped.");
    }

    @Override
    public void stop(TVContext context) {
        System.out.println("Already stopped.");
    }

    @Override
    public String getName() {
        return "Stopped State";
    }
}
