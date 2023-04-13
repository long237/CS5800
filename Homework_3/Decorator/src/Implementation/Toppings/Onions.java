package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Onions extends Toppings
{
    protected Food pizza;
    public Onions(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with onions";
    }
}
