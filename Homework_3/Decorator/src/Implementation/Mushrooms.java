package Implementation;

import Contracts.Food;
import Contracts.Toppings;

public class Mushrooms extends Toppings {
    protected Food food;
    private static final double COST = 0.25;

    public Mushrooms(Food food) {
        this.food = food;
    }

    @Override
    public String eat() {
        return food.eat() + " with mushrooms";
    }

    @Override
    public double cost() {
        return food.cost() + COST;
    }
}
