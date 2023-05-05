package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;

public class CheetosHandler extends SnackDispenseHandler {

    public CheetosHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snackType) {
        if (snackType instanceof Cheetos && snackType.getQuantity() > 0){
            snackType.setQuantity(snackType.getQuantity() - 1);
            System.out.println("Dispense Cheetos to the user");
        }
        else if (snackType instanceof Cheetos && snackType.getQuantity() == 0){
            System.out.println("Out of Cheetos");
        }
        else {
            System.out.println("Passed from CheetosHandler");
            super.dispenseSnack(snackType);
        }
    }
}
