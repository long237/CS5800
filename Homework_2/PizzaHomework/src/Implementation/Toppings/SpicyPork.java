package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class SpicyPork extends Toppings {
    protected Food pizza;
    public SpicyPork(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with spicy pork";
    }
}
