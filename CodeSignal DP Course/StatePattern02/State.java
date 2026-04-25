package StatePattern02;

// TODO: Define the State interface with methods for play, pause, stop, and getName

public interface State {
    void play(TVContext context);

    void pause(TVContext context);

    void stop(TVContext context);

    String getName();
}