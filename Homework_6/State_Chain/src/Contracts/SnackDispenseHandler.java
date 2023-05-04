package Contracts;

public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }

    public void dispenseSnack(String requestType){
        if (next != null) {
            next.dispenseSnack(requestType);
        }
    }
}
