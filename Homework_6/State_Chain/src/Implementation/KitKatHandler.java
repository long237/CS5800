package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;

public class KitKatHandler extends SnackDispenseHandler {
    public KitKatHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snackType) {
        if (snackType instanceof KitKat && snackType.getQuantity() > 0){
            snackType.setQuantity(snackType.getQuantity() - 1);
            System.out.println("Dispense KitKat to the user");
        }
        else if (snackType instanceof KitKat && snackType.getQuantity() == 0){
            System.out.println("Out of KitKat");
        }
        else {
            System.out.println("Passed from KitKatHandler");
            super.dispenseSnack(snackType);
        }
    }
}
