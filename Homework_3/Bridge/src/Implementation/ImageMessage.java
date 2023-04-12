package Implementation;

import Contracts.MessageType;

public class ImageMessage implements MessageType {

    @Override
    public void sendMessage() {
        System.out.println("Send an Image message");
    }
}
