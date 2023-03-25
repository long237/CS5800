package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Onions extends Toppings
{
    protected Food pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with onions";
    }
}
