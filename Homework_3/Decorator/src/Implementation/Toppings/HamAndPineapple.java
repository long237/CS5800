package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class HamAndPineapple extends Toppings {
    protected Food pizza;
    public HamAndPineapple(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with ham and pineapple";
    }
}
