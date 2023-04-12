package Implementation;

import Contracts.MessageType;
import Contracts.MessagingApp;

public class WhatsappMessagingApp extends MessagingApp {
    public WhatsappMessagingApp(MessageType messageType) {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        messageType.sendMessage();
    }
}
