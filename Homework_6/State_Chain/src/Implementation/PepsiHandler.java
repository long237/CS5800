package Implementation;

import Contracts.SnackDispenseHandler;

public class PepsiHandler extends SnackDispenseHandler {
    public PepsiHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(String snackType) {
        if (snackType.equals("PepsiHandler")){
            System.out.println("Dispense Pepsi to the user");
        }
        else {
            System.out.println("Passed from PepsiHandler");
            super.dispenseSnack(snackType);
        }
    }
}
