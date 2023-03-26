package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Airbus extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Airbus instance = new Airbus();
    //    private static MathLibrary instance;
    private Airbus() {
        super.factoryName = "Airbus Factory";
    }

    public static Airbus getInstance() {
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
