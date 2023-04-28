package Implementation;

import java.util.Iterator;
import java.util.Stack;

public class SearchMessagesByUser implements Iterator {
    private Stack<MessageMemento> messageMementosList;
    private int messageMementoSize;
    private int messageMementoIndex;
    private User user;

    public SearchMessagesByUser(ChatHistory history, User user ) {
        this.messageMementosList = history.getMessageMementosList();
        this.messageMementoSize = history.getMessageMementosList().size();
        this.messageMementoIndex = 0;
        this.user = user;
    }

    @Override
    public boolean hasNext() {
        User user = null;
        while(messageMementoIndex < messageMementoSize) {
            MessageMemento msgMemento = messageMementosList.get(messageMementoIndex);
            user = msgMemento.getState().getSender();
            if (this.user == user) {
                return true;
            }
            else {
                messageMementoIndex++;
            }
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return messageMementosList.get(messageMementoIndex++);
        }
        return null;
    }
}
