package Implementation;

import Contracts.AbstractFactory;
import Contracts.Buildable;
import Contracts.Repairable;
import Contracts.Restorable;

import java.io.IOException;
import java.nio.CharBuffer;

public class Embraer extends AbstractFactory implements Buildable, Repairable, Restorable {
    private static Embraer instance = new Embraer();
    //    private static MathLibrary instance;
    private Embraer() {
        super.factoryName = "Embraer Factory";
    }

    public static Embraer getInstance() {
        return instance;
    }

    @Override
    public String buildVehicle() {
        return (this.factoryName + "build an airplane");
    }

    @Override
    public String restoreVehicle() {
        return (this.factoryName + "restore an airplane");
    }

    @Override
    public String repairVehicle() {
        return (this.factoryName + "repair an airplane");
    }
}
