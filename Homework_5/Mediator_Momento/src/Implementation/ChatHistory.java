package Implementation;

import Contracts.IterableByUser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ChatHistory implements IterableByUser {
    private Stack<MessageMemento> messageMementosList = new Stack<MessageMemento>();

    public Stack<MessageMemento> getMessageMementosList() {
        return messageMementosList;
    }

    public Message getLastMessageSent() {
        MessageMemento memento = messageMementosList.peek();
        return memento.getState();
    }
    public void add(Message message) {
        MessageMemento msgMemento = new MessageMemento(message);
        messageMementosList.push(msgMemento);
    }

    public void addAll(List<MessageMemento> messages) {
        messageMementosList.addAll(messages);
    }

    public void undo() {
        messageMementosList.pop();
    }

    public MessageMemento get(int index){
        return messageMementosList.get(index);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (MessageMemento memento : messageMementosList) {
            String content = memento.getState().getContent();
            result.append(content);
            result.append(", ");
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public Iterator iterator(User userToSearchWith) {
        return new SearchMessagesByUser(this, userToSearchWith);
    }
}
