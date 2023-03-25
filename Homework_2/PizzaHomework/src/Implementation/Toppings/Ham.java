package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Ham extends Toppings {
    protected Food pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with ham";
    }
}
