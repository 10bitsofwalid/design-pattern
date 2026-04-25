package ApplyingBehavioralPatternsinaChatApplication01;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<User> users = new ArrayList<>();

    // TODO: Implement the showMessage method to display the message.
    public void showMessage(String message) {
        System.out.println("[ChatRoom] " + message);
    }

    // TODO: Implement the addUser method to add users to the chat room.
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " joined the chat room.");
    }

    // TODO: Implement the sendMessage method to send messages to all users.
    public void sendMessage(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}
