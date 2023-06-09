package Implementation;

import Contracts.Food;

public class Pizza extends Food {
    private static final double COST = 1.50;
    public Pizza() {
        description = "Plain Pizza";
    }

    public double cost() {
        return COST;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "description='" + description + '\'' +
                '}';
    }
}
