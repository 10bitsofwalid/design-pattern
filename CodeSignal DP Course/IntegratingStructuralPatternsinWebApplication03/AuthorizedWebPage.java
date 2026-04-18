package IntegratingStructuralPatternsinWebApplication03;

// TODO: Complete the implementation of the AuthorizedWebPage class to add authorization to the web page.
public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(WebPage page) {
        // TODO: Pass the page to the superclass constructor
        super(page);
    }

    // TODO: Override the render method to add " with Authorization" to the result
    @Override
    public String render() {
        return super.render() + " with Authorization";
    }
}