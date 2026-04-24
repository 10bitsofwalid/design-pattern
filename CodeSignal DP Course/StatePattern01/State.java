package StatePattern01;

public interface State {
    void play(MusicPlayerContext context);

    void pause(MusicPlayerContext context);

    void stop(MusicPlayerContext context);

    String getName();
}