package ApplyingBehavioralPatternsinaChatApplication01;

public class ChatCommand implements Command {
    private ChatRoom chatRoom;
    private String message;

    // TODO: Implement the constructor to initialize chatRoom and message.

    public ChatCommand(ChatRoom chatRoom, String message) {
        this.chatRoom = chatRoom;
        this.message = message;
    }

    @Override
    public void execute() {
        // TODO: Call the appropriate method on chatRoom to show the message.

        chatRoom.showMessage(message);
        chatRoom.sendMessage(message);
    }
}