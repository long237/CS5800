package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;
import Contracts.StateOfVendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private StateOfVendingMachine state = new IdleState();
    private SnackDispenseHandler snackHandler =
            new CokeHandler(new PepsiHandler(new CheetosHandler(
                    new DoritosHandler(new KitKatHandler(new SnickersHandler(null))))));
    private List<Snack> inventory = new ArrayList<Snack>();
    private String currentSelection;

    public VendingMachine() {
    }

    public VendingMachine(StateOfVendingMachine state) {
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void selectSnack(String snack) {
        this.currentSelection = snack;
        state.doAction(this);
    }

    public void addSnack(Snack snack) {
        this.inventory.add(snack);
    }

    public double insertMoney(double money) {
        // Find the Snack that the user wanted
        Snack userSelection = null;
        for (Snack snack : inventory) {
            String snackName = snack.getName();
            if(snackName.equals(currentSelection)){
                userSelection = snack;
            }
        }

        // Determine if the user put in enough money
        if (userSelection.getQuantity() <= 0) {
            this.state = new IdleState();
            System.out.println("Vending machine out of " + userSelection.getName());
            return money;
        }
        else if (money >= (userSelection.getPrice()) && this.state instanceof WaitForMoneyState){
            state.doAction(this);
            dispenseSnack(userSelection);
            return money - userSelection.getPrice();
        }
        else{
            System.out.println("Not enough money. Return: $" + money + " to user");
            return money;
        }
    }

    public void dispenseSnack(Snack snack) {
        this.state.doAction(this);
        this.snackHandler.dispenseSnack(snack);

    }
}
