package Contracts;

import Contracts.Food;

public abstract class PizzaFactory {
    protected String factoryName;
    public abstract Food getPizza(String pizzaName);
}
