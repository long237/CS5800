import Contracts.Food;
import Implementation.*;

public class Main {
    public static void main(String[] args) {

        // Pizza
        Food pizza = new Pizza();
        pizza = new Onions(pizza);
        pizza = new Pesto(pizza);
        pizza = new Spinach(pizza);

        System.out.println(pizza.eat());
        System.out.println("Cost of pizza is: " + pizza.cost());

        //Burger
        Food burger = new Burger();
        burger = new Mushrooms(burger);
        burger = new Onions(burger);
        burger = new Peppers(burger);

        //Fries
        Food fries = new Fries();
        fries = new Chili(fries);
        fries = new Peppers(fries);

        System.out.println(burger.eat());
        System.out.println("Cost of pizza is: " + burger.cost());

        System.out.println("--------------------");
        Order customerOrder = new Order();
        customerOrder.addItems(burger);
        customerOrder.addItems(pizza);
        customerOrder.addItems(fries);
        double total = customerOrder.getCost();
        System.out.println("Customer Orders: " + customerOrder);
        System.out.println("Total: " + total);

        //Create Customer Loyalty
        Loyalty customerLoyalty = new Loyalty(Level.GOLD);
        double goldDiscount = customerLoyalty.applyDiscount(total);
        System.out.println("Apply Gold Status for 20% discount: ");
        System.out.println(goldDiscount);

        Loyalty silverLoyalty = new Loyalty(Level.SILVER);
        double silverDiscount = silverLoyalty.applyDiscount(total);
        System.out.println("Apply Silver Status for 15% discount: ");
        System.out.println(silverDiscount);

        Loyalty bronzeLoyalty = new Loyalty(Level.BRONZE);
        double bronzeDiscount = bronzeLoyalty.applyDiscount(total);
        System.out.println("Apply Bronze Status for 10% discount: ");
        System.out.println(bronzeDiscount);

    }
}