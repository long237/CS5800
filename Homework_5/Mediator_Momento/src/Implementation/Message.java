package Implementation;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Message {
    private User sender;
    private List<User> receivers;
    private LocalDateTime timestamp = LocalDateTime.now();
    private String content;

    public Message(User sender, List<User> receivers, String content) {
        this.sender = sender;
        this.receivers = receivers;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public List<User> getReceiver() {
        return receivers;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender=" + sender +
                ", receivers=" + receivers +
                ", timestamp=" + timestamp +
                ", content='" + content + '\'' +
                '}';
    }
}
