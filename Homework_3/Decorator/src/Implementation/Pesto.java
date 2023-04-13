package Implementation;

import Contracts.Food;
import Contracts.Toppings;

public class Pesto extends Toppings {
    protected Food food;
    private static final double COST = 1.25;
    public Pesto(Food food) {
        this.food = food;
    }
    @Override
    public String eat() {
        return food.eat() + " with pesto";
    }
    public double cost() {
        return food.cost() + COST;
    }
}
