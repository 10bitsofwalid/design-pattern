package CommandPattern03;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of TextEditor
        // TODO: Create instances of BoldCommand and ItalicCommand using the TextEditor
        // instance
        // TODO: Create an instance of TextEditorInvoker and use it to execute both
        // commands

        TextEditor textEditor = new TextEditor();

        Command bold = new BoldCommand(textEditor);
        Command italic = new ItalicCommand(textEditor);

        TextEditorInvoker invoker = new TextEditorInvoker();

        invoker.setCommand(bold);
        invoker.pressButton();

        invoker.setCommand(italic);
        invoker.pressButton();

    }
}
