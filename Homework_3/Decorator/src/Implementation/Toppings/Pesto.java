package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Pesto extends Toppings {
    protected Food pizza;
    public Pesto(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with pesto";
    }
}
