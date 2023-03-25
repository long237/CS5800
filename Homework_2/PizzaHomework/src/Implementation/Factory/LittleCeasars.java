package Implementation.Factory;

import Contracts.Food;
import Contracts.PizzaFactory;

public class LittleCeasars extends PizzaFactory {
    public LittleCeasars() {
        super.factoryName = "Little Ceasars";
    }
    @Override
    public Food getPizza(String pizzaName) {
        return null;
    }

    @Override
    public String toString() {
        return "LittleCeasars{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
