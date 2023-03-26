package Implementation;

import Contracts.AbstractFactory;
import Contracts.FactoryProducer;

public class FactoryMaker extends FactoryProducer {
    @Override
    public AbstractFactory getFactory(String factoryName) {
        AbstractFactory factory = null;

        switch (factoryName) {
            case "Honda" -> factory = Honda.getInstance();
            case "Tesla" -> factory = Tesla.getInstance();
            case "Porsche" -> factory = Porsche.getInstance();
            case "Boeing" -> factory = Boeing.getInstance();
            case "Airbus" -> factory = Airbus.getInstance();
            case "Embraer" -> factory = Embraer.getInstance();
            case "SeaRay" -> factory = SeaRay.getInstance();
            case "Mastercraft" -> factory = Mastercraft.getInstance();
            case "Bertram" -> factory = Bertram.getInstance();
        }
        return factory;
    }
}
