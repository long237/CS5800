package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class TomatoAndBasil extends Toppings {
    protected Food pizza;
    public TomatoAndBasil(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with tomato and basil";
    }
}
