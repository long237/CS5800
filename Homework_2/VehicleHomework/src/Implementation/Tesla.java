package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Tesla extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Tesla instance = new Tesla();
    //    private static MathLibrary instance;
    private Tesla() {
        super.factoryName = "Tesla Factory";
    }

    public static Tesla getInstance() {
        return instance;
    }
    @Override
    public String buildVehicle() {
        return (this.factoryName + "build a car");
    }

    @Override
    public String repairVehicle() {
        return (this.factoryName + "repair a car");
    }

    @Override
    public String restoreVehicle() {
        return (this.factoryName + "restore a car");
    }
}
