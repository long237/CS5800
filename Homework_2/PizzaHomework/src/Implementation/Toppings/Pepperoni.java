package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Pepperoni extends Toppings {
    protected Food pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with pepperoni";
    }
}
