package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Olives extends Toppings {
    protected Food pizza;
    public Olives(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with olives";
    }
}
