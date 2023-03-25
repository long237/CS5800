package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class HamAndPineapple extends Toppings {
    protected Food pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with ham and pineapple";
    }
}
