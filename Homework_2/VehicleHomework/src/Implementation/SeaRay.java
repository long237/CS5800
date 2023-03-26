package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class SeaRay extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static SeaRay instance = new SeaRay();
    //    private static MathLibrary instance;
    private SeaRay() {
        super.factoryName = "SeaRay Factory";
    }

    public static SeaRay getInstance() {
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
