package Contracts;

import Implementation.Pizza;

public abstract class FactoryProducer {
    public abstract PizzaFactory getFactory(String factoryName);
}
