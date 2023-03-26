package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Boeing extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Boeing instance = new Boeing();
    //    private static MathLibrary instance;
    private Boeing() {
        super.factoryName = "Boeing Factory";
    }

    public static Boeing getInstance() {
        return instance;
    }
    @Override
    public String buildVehicle() {
        return (this.factoryName + "build an airplane");
    }

    @Override
    public String repairVehicle() {
        return (this.factoryName + "repair an airplane");
    }

    @Override
    public String restoreVehicle() {
        return (this.factoryName + "restore an airplane");
    }
}
