package DecoratorDP03;

// TODO: Implement the SimpleText class that provides a base implementation of the Text interface.
public class SimpleText implements Text {
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        // Return the text
        return text;
    }
}
