package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Porsche extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Porsche instance = new Porsche();

    //    private static MathLibrary instance;
    private Porsche() {
        super.factoryName = "Porsche Factory";
    }

    public static Porsche getInstance() {
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
