package Implementation;

public class MessageMemento {
    private Message message;

    public MessageMemento(Message state){
        this.message = state;
    }

    public Message getState(){
        return message;
    }

    @Override
    public String toString() {
        return "MessageMemento{" +
                "message=" + message +
                '}';
    }
}
