package CommandPattern03;

// TODO: Implement the ItalicCommand class

// - The class should implement the Command interface
// - It should have a constructor that initializes a TextEditor object
// - The execute method should call the italic method of the TextEditor object

public class ItalicCommand implements Command {
    private TextEditor textEditor;

    public ItalicCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.italic();
    }
}