package Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatServer {
    private String serverName;
    private List<User> users = new ArrayList<User>();
    private HashMap<String , List<User>> blockedUserCollection = new HashMap<String, List<User>>();

    public ChatServer(String serverName) {
        this.serverName = serverName;
    }

    public void registerUser(User user) {
        users.add(user);
    }
    public void blockUser (User blocker, User blockedUser){
        String blockerName = blocker.getUserName();
        List<User> blockedUsers;
        if (blockedUserCollection.containsKey(blockerName)) {
            blockedUsers = blockedUserCollection.get(blockerName);
        }
        else { // If the users has not blocked anyone
            blockedUsers = new ArrayList<>();
        }
        blockedUsers.add(blockedUser);
        blockedUserCollection.put(blockerName, blockedUsers);
    }
    public void sendMessage(Message message) {
        List<User> receivers = message.getReceiver();
        for (User receiver : receivers) {
            List<User> blockedUsers = blockedUserCollection.get(receiver.getUserName());
            if (blockedUsers == null) {
                receiver.receiveMessage(message);
            }
            else if (!blockedUsers.contains(message.getSender())) {
                receiver.receiveMessage(message);
            }
        }
    }

    public void undoLastSentMessage(Message message) {
        List<User> receivers = message.getReceiver();
        for (User receiver : receivers) {
            receiver.removeUndoMessage();
        }
    }

    @Override
    public String toString() {
        return "ChatServer{" +
                "serverName='" + serverName + '\'' +
                ", users=" + users +
                '}';
    }
}
