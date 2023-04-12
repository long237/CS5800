package Implementation;

import Contracts.MessageType;
import Contracts.MessagingApp;

public class TelegramMessagingApp extends MessagingApp {
    public TelegramMessagingApp(MessageType messageType) {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        messageType.sendMessage();
    }
}
