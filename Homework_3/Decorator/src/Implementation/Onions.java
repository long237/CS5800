package Implementation;

import Contracts.Food;
import Contracts.Toppings;

public class Onions extends Toppings
{
    private static final double COST = 0.75;
    protected Food food;
    public Onions(Food food) {
        this.food = food;
    }
    @Override
    public String eat() {
        return food.eat() + " with onions";
    }
    public double cost() {
        return food.cost() + COST;
    }
}
