package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;

public class PepsiHandler extends SnackDispenseHandler {
    public PepsiHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snackType) {
        if (snackType instanceof Pepsi && snackType.getQuantity() > 0){
            snackType.setQuantity(snackType.getQuantity() - 1);
            System.out.println("Dispense Pepsi to the user");
        }
        else if (snackType instanceof Pepsi && snackType.getQuantity() == 0){
            System.out.println("Out of Pepsi");
        }
        else {
            System.out.println("Passed from PepsiHandler");
            super.dispenseSnack(snackType);
        }
    }
}
