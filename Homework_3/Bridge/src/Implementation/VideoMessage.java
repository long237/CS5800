package Implementation;

import Contracts.MessageType;

public class VideoMessage implements MessageType {

    @Override
    public void sendMessage() {
        System.out.println("Send a video message");
    }
}
