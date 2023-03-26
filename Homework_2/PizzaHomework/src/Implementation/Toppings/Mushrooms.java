package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Mushrooms extends Toppings {
    protected Food pizza;

    public Mushrooms(Food pizza) {
        this.pizza = pizza;
    }

    @Override
    public String eat() {
        return pizza.eat() + " with mushrooms";
    }
}
