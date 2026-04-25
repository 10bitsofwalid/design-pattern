package StatePattern02;

// TODO: Implement the TVContext class which holds the current state

// TODO: Initialize with StoppedState
// TODO: Implement setState() and getCurrentState() methods
// TODO: Implement play(), pause(), and stop() methods

public class TVContext {
    private State state;

    public TVContext() {
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
