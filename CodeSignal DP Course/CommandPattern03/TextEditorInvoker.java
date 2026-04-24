package CommandPattern03;

// TODO: Implement the TextEditorInvoker class

// - The class should have a Command field to hold the current command
// - Implement the setCommand method to assign a command to the invoker
// - Implement the pressButton method to execute the assigned command

public class TextEditorInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
