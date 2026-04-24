package CommandPattern03;

// TODO: Implement the BoldCommand class
// - The class should implement the Command interface
// - It should have a constructor that initializes a TextEditor object
// - The execute method should call the bold method of the TextEditor object

public class BoldCommand implements Command {
    private TextEditor textEditor;

    public BoldCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.bold();
    }
}
