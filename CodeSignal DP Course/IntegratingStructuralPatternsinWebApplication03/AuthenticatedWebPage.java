package IntegratingStructuralPatternsinWebApplication03;

// TODO: Complete the implementation of the AuthenticatedWebPage class to add authentication to the web page.
public class AuthenticatedWebPage extends WebPageDecorator {
    
    public AuthenticatedWebPage(WebPage page) {
        // TODO: Pass the page to the superclass constructor
        super(page);
    }

    // TODO: Override the render method to add " with Authentication" to the result
    @Override
    public String render() {
        return super.render() + " with Authentication";
    }
}