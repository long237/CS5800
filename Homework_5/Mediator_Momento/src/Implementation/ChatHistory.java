package Implementation;

import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    private List<MessageMemento> messageMementosList = new ArrayList<MessageMemento>();

    public void add(MessageMemento state){
        messageMementosList.add(state);
    }

    public MessageMemento get(int index){
        return messageMementosList.get(index);
    }
}
