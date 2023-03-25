package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Bacon extends Toppings {
    protected Food pizza;

    public Bacon(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with bacon";
    }

}
