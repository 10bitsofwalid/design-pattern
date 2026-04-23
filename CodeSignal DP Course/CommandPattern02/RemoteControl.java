package CommandPattern02;

// TODO: Implement the RemoteControl class
// - The class should have a private Command field to hold the current command
// - Implement the setCommand method to assign a command to the remote
// - Implement the pressButton method to execute the assigned command

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
