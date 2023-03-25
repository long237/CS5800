package Implementation;

import Contracts.Food;

public class Pizza extends Food {
    protected  String size;
    public Pizza() {
        description = "Plain Pizza";
    }
    public Pizza(String size) {
        this.size = size;
        this.description = size + " size Pizza";
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                '}';
    }
}
