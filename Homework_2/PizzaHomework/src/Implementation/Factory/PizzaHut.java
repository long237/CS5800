package Implementation.Factory;

import Contracts.Food;
import Contracts.PizzaFactory;

public class PizzaHut extends PizzaFactory {

    public PizzaHut() {
        super.factoryName = "Pizza Hut";
    }
    public Food getPizza(String pizzaName){
        return null;
    };

    @Override
    public String toString() {
        return "PizzaHut{" +
                "factoryName='" + factoryName + '\'' +
                '}';
    }
}
