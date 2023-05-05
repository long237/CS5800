package Implementation;

import Contracts.StateOfVendingMachine;

public class IdleState implements StateOfVendingMachine {
    @Override
    public void doAction(VendingMachine machine) {
        System.out.println("Vending Machine in Idle. Waiting for user Selection");
        machine.setState(new WaitForMoneyState());
    }
}
