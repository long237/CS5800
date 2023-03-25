package Implementation.Factory;

import Contracts.Food;
import Contracts.PizzaFactory;
import Implementation.Pizza;

public class Dominos extends PizzaFactory {
    public Dominos() {
        super.factoryName = "Domino";
    }

    @Override
    public Food getPizza(String pizzaName) {
        return null;
    }

    @Override
    public String toString() {
        return "Dominos{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
