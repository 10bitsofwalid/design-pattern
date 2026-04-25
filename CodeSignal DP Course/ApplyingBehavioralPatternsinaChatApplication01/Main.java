package ApplyingBehavioralPatternsinaChatApplication01;

public class Main {
    public static void main(String[] args) {
        // TODO: Create instances of ChatRoom, User, and ChatCommand.
        // TODO: Add users to the chat room.
        // TODO: Use the ChatCommand to send a message and execute it.

        ChatRoom chatRoom = new ChatRoom();

        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        System.out.println();

        Command message1 = new ChatCommand(chatRoom, "Hello everyone!");
        message1.execute();

        System.out.println();

        Command message2 = new ChatCommand(chatRoom, "How is everyone doing?");
        message2.execute();
    }
}
