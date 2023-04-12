package Contracts;

public abstract class MessagingApp {
    protected MessageType messageType;

    protected MessagingApp(MessageType messageType) {
        this.messageType = messageType;
    }

    public abstract void sendMessage();

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
