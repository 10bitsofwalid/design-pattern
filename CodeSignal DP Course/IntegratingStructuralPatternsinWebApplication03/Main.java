package IntegratingStructuralPatternsinWebApplication03;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of BasicWebPage
        // TODO: Wrap the basicPage with an AuthenticatedWebPage decorator
        // TODO: Wrap the authenticatedPage with an AuthorizedWebPage decorator
        // TODO: Print the result of the render method of the authorizedPage
        // Expected Output: Basic Web Page with Authentication with Authorization
        
        WebPage basicPage = new BasicWebPage();

        WebPage authenticatedPage = new AuthenticatedWebPage(basicPage);

        WebPage authorizedPage = new AuthorizedWebPage(authenticatedPage);

        System.out.println(authorizedPage.render());
    }
}