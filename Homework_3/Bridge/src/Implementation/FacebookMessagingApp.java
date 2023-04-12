package Implementation;

import Contracts.MessageType;
import Contracts.MessagingApp;

public class FacebookMessagingApp extends MessagingApp {
    public FacebookMessagingApp(MessageType messageType) {
        super(messageType);
    }

    @Override
    public void sendMessage() {
        messageType.sendMessage();
    }
}
