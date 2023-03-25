package Implementation.Factory;

import Contracts.Food;
import Contracts.PizzaFactory;
import Implementation.Pizza;

public class PizzaHut extends PizzaFactory {

    public PizzaHut() {
        super.factoryName = "Pizza Hut";
    }
    public Food getPizza(String pizzaName){
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
        return "PizzaHut{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
