package Contracts;

public abstract class FactoryProducer {
    public abstract AbstractFactory getFactory(String factoryName);
}
