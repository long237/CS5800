package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;
import Contracts.StateOfVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private StateOfVendingMachine state;
    private SnackDispenseHandler snackHandler;
    private List<Snack> inventory = new ArrayList<Snack>();

    public VendingMachine(StateOfVendingMachine state) {
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void selectSnack() {

    }

    public void insertMoney(double money) {

    }
}
