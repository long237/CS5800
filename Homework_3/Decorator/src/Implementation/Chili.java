package Implementation;

import Contracts.Food;
import Contracts.Toppings;

public class Chili extends Toppings {
    protected Food food;
    public static final double COST = 2.25;
    public Chili(Food food) {
        this.food = food;
    }
    @Override
    public String eat() {
        return food.eat() + " with Chili";
    }
    public double cost() {
        return food.cost() + COST;
    }
}
