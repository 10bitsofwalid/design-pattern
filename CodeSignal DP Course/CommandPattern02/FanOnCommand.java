package CommandPattern02;

// TODO: Implement the FanOnCommand class
// - The class should implement the Command interface
// - It should have a constructor that takes a Fan object and initializes it
// - The execute method should turn on the fan

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}
