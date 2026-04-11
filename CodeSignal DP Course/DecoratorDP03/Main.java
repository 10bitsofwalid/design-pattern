package DecoratorDP03;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a SimpleText instance with the text "Hello, World!"
        // TODO: Apply BoldText and ItalicText decorators to the text
        // Output the formatted text
        // Expected output: <i><b>Hello, World!</b></i>
        
         Text text = new SimpleText("Hello, World!");

        Text boldText = new BoldText(text);
        Text italicBoldText = new ItalicText(boldText);

        System.out.println(italicBoldText.format());
    }
}
