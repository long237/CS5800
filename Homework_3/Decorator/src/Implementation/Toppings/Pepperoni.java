package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Pepperoni extends Toppings {
    protected Food pizza;
    public Pepperoni(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with pepperoni";
    }
}
