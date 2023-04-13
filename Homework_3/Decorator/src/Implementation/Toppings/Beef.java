package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Beef extends Toppings {
    protected Food pizza;
    public Beef(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with beef";
    }
}
