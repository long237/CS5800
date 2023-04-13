package Implementation;

import Contracts.Food;

public class Burger extends Food {
    private static final double COST = 2.00;
    public Burger() {
        description = "Plain Burger";
    }

    public double cost() {
        return COST;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "description='" + description + '\'' +
                '}';
    }
}
