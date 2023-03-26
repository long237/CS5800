package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Honda extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Honda instance = new Honda();
    //    private static MathLibrary instance;
    private Honda() {
        super.factoryName = "Honda Factory";
    }

    public static Honda getInstance() {
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
