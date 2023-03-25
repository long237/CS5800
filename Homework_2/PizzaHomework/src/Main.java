import Contracts.FactoryProducer;
import Contracts.Food;
import Contracts.PizzaFactory;
import Contracts.Toppings;
import Implementation.Factory.FactoryMaker;
import Implementation.Pizza;
import Implementation.Toppings.Bacon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FactoryProducer factoryProducer = new FactoryMaker();

        //Create Pizza hut
        PizzaFactory pizzaHut = factoryProducer.getFactory("PizzaHut");
        PizzaFactory dominos = factoryProducer.getFactory("Dominos");
        PizzaFactory ceasars = factoryProducer.getFactory("LittleCeasars");

        System.out.println(pizzaHut);
        System.out.println(dominos);
        System.out.println(ceasars);

        Food largeHutPizza = pizzaHut.getPizza("large");
        Toppings withBacon = new Bacon(largeHutPizza);

        System.out.println(largeHutPizza);
        System.out.println(withBacon.getDescription());


    }
}