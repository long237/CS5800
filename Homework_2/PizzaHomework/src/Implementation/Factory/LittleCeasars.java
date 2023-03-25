package Implementation.Factory;

import Contracts.Food;
import Contracts.PizzaFactory;
import Implementation.Pizza;

public class LittleCeasars extends PizzaFactory {
    public LittleCeasars() {
        super.factoryName = "Little Ceasars";
    }
    @Override
    public Food getPizza(String pizzaName) {
        if (pizzaName.equals("small")){
            return new Pizza("small");
        }
        else if (pizzaName.equals("medium")){
            return new Pizza("medium");
        }
        else if (pizzaName.equals("large")){
            return new Pizza("large");
        }
        return new Pizza();
    }

    @Override
    public String toString() {
        return "LittleCeasars{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
