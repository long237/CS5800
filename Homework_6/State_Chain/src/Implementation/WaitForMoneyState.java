package Implementation;

import Contracts.StateOfVendingMachine;

public class WaitForMoneyState implements StateOfVendingMachine {
    @Override
    public void doAction(VendingMachine machine) {
        System.out.println("Wait for user to insert money");
        machine.setState(new DispenseSnackState());
    }
}
