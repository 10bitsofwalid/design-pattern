package DecoratorDP03;

// TODO: Implement the BoldText decorator that adds bold formatting to the Text.
public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        // Extend the functionality by adding "<b>" before and "</b>" after the text
        return "<br>" + super.format() + "</br>";
    }
}
