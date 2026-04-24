package StatePattern01;

public class MusicPlayerContext {
    private State state;

    public MusicPlayerContext() {
        // Initial state is stopped
        this.state = new StoppedState();
    }

    public void setState(State state) {
        System.out.println("Transitioning from " + this.state.getName() + " to " + state.getName());
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }

    public State getCurrentState() {
        return state;
    }
}
