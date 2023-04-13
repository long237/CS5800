package Implementation;

import Contracts.Food;
import Contracts.Toppings;

public class Spinach extends Toppings {
    protected Food food ;
    private static final double COST = 2.00;
    public Spinach(Food food) {
        this.food = food;
    }
    @Override
    public String eat() {
        return food.eat() + " with spinach";
    }
    public double cost() {
        return food.cost() + COST;
    }
}
