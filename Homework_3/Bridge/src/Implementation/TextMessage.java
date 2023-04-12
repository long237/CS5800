package Implementation;

import Contracts.MessageType;

public class TextMessage implements MessageType {

    @Override
    public void sendMessage() {
        System.out.println("Send a text message");
    }
}
