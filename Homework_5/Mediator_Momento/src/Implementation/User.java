package Implementation;

import Contracts.IterableByUser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User implements IterableByUser {
    private String userName;
    private ChatServer server;
    private ChatHistory sentChatHistory = new ChatHistory();
    private ChatHistory receivedChatHistory = new ChatHistory();

    public User(String userName, ChatServer server) {
        this.userName = userName;
        this.server = server;
    }

    public String getUserName() {
        return userName;
    }

    public void blockUser(User user) {
        server.blockUser(this, user);
    }

    public void sendMessage(List<User> receivers, String message) {
        Message msg = new Message(this, receivers, message);
        sentChatHistory.add(msg);
        server.sendMessage(msg);
    }

    public void receiveMessage(Message message) {
        receivedChatHistory.add(message);
    }

    public void undoLastSentMessage() {
        Message lastSentMessage = sentChatHistory.getLastMessageSent();
        sentChatHistory.undo();
        server.undoLastSentMessage(lastSentMessage);
    }

    public void removeUndoMessage() {
        receivedChatHistory.undo();
    }

    public ChatHistory getSentChatHistory() {
        return sentChatHistory;
    }

    public ChatHistory getReceivedChatHistory() {
        return receivedChatHistory;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return this.receivedChatHistory.iterator(userToSearchWith);
    }
}
