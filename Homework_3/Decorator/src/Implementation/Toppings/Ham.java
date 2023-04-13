package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class Ham extends Toppings {
    protected Food pizza;
    public Ham(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with ham";
    }
}
