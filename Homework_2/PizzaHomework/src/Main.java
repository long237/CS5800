import Contracts.FactoryProducer;
import Contracts.Food;
import Contracts.PizzaFactory;
import Contracts.Toppings;
import Implementation.Factory.FactoryMaker;
import Implementation.Pizza;
import Implementation.Toppings.*;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryMaker();

        //Create Pizza hut
        PizzaFactory pizzaHut = factoryProducer.getFactory("PizzaHut");
        PizzaFactory dominos = factoryProducer.getFactory("Dominos");
        PizzaFactory ceasars = factoryProducer.getFactory("LittleCeasars");

//        System.out.println(pizzaHut);
//        System.out.println(dominos);
//        System.out.println(ceasars);

        // Creating Large Pizza for Pizza Hut
        Food largeHutPizza = pizzaHut.getPizza("large");
        largeHutPizza = new Bacon(largeHutPizza);
        largeHutPizza = new Mushrooms(largeHutPizza);
        largeHutPizza = new Spinach(largeHutPizza);

        System.out.println("Pizza for Pizza Hut factory: ");
        System.out.println(largeHutPizza.eat());

        // Creating Small Pizza with 2 toppings for pizza hut
        Food smallHutPizza = pizzaHut.getPizza("small");
        smallHutPizza = new Ham(smallHutPizza);
        smallHutPizza = new ExtraCheese(smallHutPizza);

        System.out.println(smallHutPizza.eat());
        System.out.println("");

        // Create Pizza for Little Ceasars with 8 toppings
        Food mediumCeasarsPizza = ceasars.getPizza("medium");
        mediumCeasarsPizza = new Olives(mediumCeasarsPizza);
        mediumCeasarsPizza = new Onions(mediumCeasarsPizza);
        mediumCeasarsPizza = new Pepperoni(mediumCeasarsPizza);
        mediumCeasarsPizza = new Peppers(mediumCeasarsPizza);
        mediumCeasarsPizza = new Pesto(mediumCeasarsPizza);
        mediumCeasarsPizza = new Beef(mediumCeasarsPizza);
        mediumCeasarsPizza = new Sausage(mediumCeasarsPizza);
        mediumCeasarsPizza = new TomatoAndBasil(mediumCeasarsPizza);

        System.out.println("Pizza for Little Ceasars factory");
        System.out.println(mediumCeasarsPizza.eat());

        // Create Pizza for Little Ceasars with 6 toppings
        Food smallCeasarsPizza = ceasars.getPizza("small");
        smallCeasarsPizza = new Bacon(smallCeasarsPizza);
        smallCeasarsPizza = new Pesto(smallCeasarsPizza);
        smallCeasarsPizza = new Olives(smallCeasarsPizza);
        smallCeasarsPizza = new Pesto(smallCeasarsPizza);
        smallCeasarsPizza = new Chicken(smallCeasarsPizza);
        smallCeasarsPizza = new Peppers(smallCeasarsPizza);

        System.out.println(smallCeasarsPizza.eat());
        System.out.println("");

        //Pizzas for Dominos pizzas
        // Create Pizza for Dominos with 1 toppings
        Food smallDominoPizza = dominos.getPizza("small");
        smallDominoPizza = new Pesto(smallDominoPizza);

        System.out.println("Pizza for Dominos Factory");
        System.out.println(smallDominoPizza.eat());

        Food largeDominoPizza = dominos.getPizza("large");
        largeDominoPizza = new Sausage(largeDominoPizza);
        largeDominoPizza = new Olives(largeDominoPizza);
        largeDominoPizza = new TomatoAndBasil(largeDominoPizza);

        System.out.println(largeDominoPizza.eat());
    }
}