package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;

public class SnickersHandler extends SnackDispenseHandler {
    public SnickersHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snackType) {
        if (snackType instanceof Snickers && snackType.getQuantity() > 0){
            snackType.setQuantity(snackType.getQuantity() - 1);
            System.out.println("Dispense Snickers to the user");
        }
        else {
            System.out.println("Passed from SnickersHandler");
            super.dispenseSnack(snackType);
        }
    }
}
