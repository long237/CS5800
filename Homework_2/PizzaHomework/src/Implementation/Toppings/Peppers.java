package Implementation.Toppings;

import Contracts.Food;

public class Peppers extends Food
{
    protected Food pizza;
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with peppers";
    }
}
