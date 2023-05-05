package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;

public class CokeHandler extends SnackDispenseHandler {
    public CokeHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snackType) {
        if (snackType instanceof Coke && snackType.getQuantity() > 0){
            snackType.setQuantity(snackType.getQuantity() - 1);
            System.out.println("Dispense Coke to the user");
        }
        else if (snackType instanceof Coke && snackType.getQuantity() == 0){
            System.out.println("Out of Coke");
        }
        else {
            System.out.println("Passed from CokeHandler");
            super.dispenseSnack(snackType);
        }
    }
}
