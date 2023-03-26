package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Bertram extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Bertram instance = new Bertram();
    //    private static MathLibrary instance;
    private Bertram() {
        super.factoryName = "Bertram Factory";
    }

    public static Bertram getInstance() {
        return instance;
    }

    @Override
    public String buildVehicle() {
        return (this.factoryName + "build a ship");
    }
    @Override
    public String repairVehicle() {
        return (this.factoryName + "repair ship");
    }

    @Override
    public String restoreVehicle() {
        return (this.factoryName + "restore a ship");
    }
}
