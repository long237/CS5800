package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Bacon extends Toppings {
    protected Food pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with bacon";
    }
}
