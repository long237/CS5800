package Implementation;

import Contracts.Food;
import Contracts.Toppings;

public class Olives extends Toppings {
    protected Food food;
    public static final double COST = 0.50;
    public Olives(Food food) {
        this.food = food;
    }
    @Override
    public String eat() {
        return food.eat() + " with olives";
    }
    @Override
    public double cost() {
        return food.cost() + COST;
    }
}
