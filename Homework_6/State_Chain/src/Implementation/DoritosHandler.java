package Implementation;

import Contracts.Snack;
import Contracts.SnackDispenseHandler;

public class DoritosHandler extends SnackDispenseHandler {
    public DoritosHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snackType) {
        if (snackType instanceof Doritos && snackType.getQuantity() > 0){
            snackType.setQuantity(snackType.getQuantity() - 1);
            System.out.println("Dispense Doritos to the user");
        }
        else if (snackType instanceof Doritos && snackType.getQuantity() == 0){
            System.out.println("Out of Doritos");
        }
        else {
            System.out.println("Passed from DoritosHandler");
            super.dispenseSnack(snackType);
        }
    }
}
