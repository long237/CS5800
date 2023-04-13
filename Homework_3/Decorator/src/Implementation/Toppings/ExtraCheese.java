package Implementation.Toppings;

import Contracts.Food;
import Contracts.Toppings;

public class ExtraCheese extends Toppings {
    protected Food pizza;

    public ExtraCheese(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with extra cheese";
    }
}
