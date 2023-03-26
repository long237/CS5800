package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Chicken extends Toppings {
    protected Food pizza;

    public Chicken(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with chicken";
    }
}
