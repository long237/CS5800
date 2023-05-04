package Implementation;

import Contracts.StateOfVendingMachine;

public class DispenseSnackState implements StateOfVendingMachine {
    @Override
    public void doAction(VendingMachine machine) {
        System.out.println("Dispensing Snack to User");
    }
}
