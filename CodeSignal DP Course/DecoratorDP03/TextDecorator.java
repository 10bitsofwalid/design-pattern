package DecoratorDP03;

// TODO: Create an abstract TextDecorator class that implements the Text interface and adds extra functionality.
public abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text text) {
        this.decoratedText = text;
    }

    @Override
    public String format() {
        // Return the result of calling format() on decoratedText
        return decoratedText.format();
    }
}
