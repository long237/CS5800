package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Sausage extends Toppings {
    protected Food pizza;
    public Sausage(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with sausage";
    }
}
