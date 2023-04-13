package Implementation.Factory;

import Contracts.FactoryProducer;
import Contracts.PizzaFactory;
import Implementation.Pizza;

public class FactoryMaker extends FactoryProducer {
    @Override
    public PizzaFactory getFactory(String factoryName) {
        PizzaFactory factory = null;

        switch (factoryName) {
            case "PizzaHut" -> factory = new PizzaHut();
            case "Dominos" -> factory = new Dominos();
            case "LittleCeasars" -> factory = new LittleCeasars();
        }
        return factory;
    }
}
