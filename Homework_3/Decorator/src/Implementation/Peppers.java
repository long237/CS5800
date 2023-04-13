package Implementation;

import Contracts.Food;

public class Peppers extends Food
{
    protected Food food;
    private static final double COST = 0.75;
    public Peppers(Food food) {
        this.food = food;
    }
    @Override
    public String eat() {
        return food.eat() + " with peppers";
    }
    public double cost() {
        return food.cost() + COST;
    }
}
