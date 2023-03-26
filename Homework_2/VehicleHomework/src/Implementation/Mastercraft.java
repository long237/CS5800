package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

public class Mastercraft extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Mastercraft instance = new Mastercraft();
    //    private static MathLibrary instance;
    private Mastercraft() {
        super.factoryName = "Mastercraft Factory";
    }

    public static Mastercraft getInstance() {
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
