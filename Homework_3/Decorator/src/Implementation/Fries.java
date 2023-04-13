package Implementation;

import Contracts.Food;

public class Fries extends Food {
    public static final double COST = 2.50;
    public Fries() {
        description = "Plain Fries";
    }

    public double cost() {
        return COST;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "description='" + description + '\'' +
                '}';
    }
}
