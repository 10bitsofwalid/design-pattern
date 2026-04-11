package DecoratorDP03;

// TODO: Implement the ItalicText decorator that adds italic formatting to the Text.
public class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        // Extend the functionality by adding "<i>" before and "</i>" after the text
        return "<i>" + super.format() + "</i>";
    }
}