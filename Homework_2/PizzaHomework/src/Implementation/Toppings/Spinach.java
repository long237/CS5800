package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Spinach extends Toppings {
    protected Food pizza;
    public Spinach(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with spinach";
    }
}
