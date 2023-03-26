package Implementation.Toppings;

import Contracts.Food;

public class Peppers extends Food
{
    protected Food pizza;
    public Peppers(Food pizza) {
        this.pizza = pizza;
    }
    @Override
    public String eat() {
        return pizza.eat() + " with peppers";
    }
}
