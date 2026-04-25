package StatePattern02;

public class Main {
    public static void main(String[] args) {
        // TODO: Demonstrate all possible state transitions
        // TODO: Show invalid state transitions
        // TODO: Print current state and transition messages

        TVContext tv = new TVContext();

        System.out.println("Initial state: " + tv.getCurrentState().getName());

        tv.pause();

        tv.stop();

        tv.play();

        tv.play();

        tv.pause();

        tv.pause();

        tv.play();

        tv.stop();

        tv.play();
        tv.pause();
        tv.stop();
    }
}