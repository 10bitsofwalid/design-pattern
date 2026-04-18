package IntegratingStructuralPatternsinWebApplication03;

// TODO: Complete the implementation of the WebPageDecorator class to add new features to the web page.
public abstract class WebPageDecorator implements WebPage {
    protected WebPage decoratedPage;

    public WebPageDecorator(WebPage page) {
        // TODO: Initialize the decoratedPage variable
        this.decoratedPage = page;
    }

    // TODO: Implement the render method to return the result of the decoratedPage's render method
    @Override
    public String render() {
        return decoratedPage.render();
    }
}