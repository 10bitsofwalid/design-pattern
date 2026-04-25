package ApplyingBehavioralPatternsinaChatApplication01;

public class User {
    private String name;

    // TODO: Implement the constructor to initialize the user name.

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Implement the receiveMessage method to display the received message.
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}