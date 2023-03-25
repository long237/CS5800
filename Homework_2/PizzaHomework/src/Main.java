import Contracts.FactoryProducer;
import Contracts.PizzaFactory;
import Implementation.Factory.FactoryMaker;

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
    }
}