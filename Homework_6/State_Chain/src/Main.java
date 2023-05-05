import Contracts.Snack;
import Implementation.*;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Snack coke = new Coke("coke", 1.50, 3);
        Snack cheetos = new Cheetos("cheetos", 2, 5);
        Snack doritos = new Doritos("doritos", 3.20, 4);
        Snack kitkat = new KitKat("kitkat", 4.50, 4);
        Snack pepsi = new Pepsi("pepsi", 1.20, 2);
        Snack snickers = new Snickers("snickers", 2.50, 3);

        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitkat);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(snickers);

        // Buying Pepsi
        double CASH = 5;
        vendingMachine.selectSnack("pepsi");
        double change = vendingMachine.insertMoney(CASH);
        System.out.println("Change after item: " + change);

        // Buying Pepsi again
        System.out.println();
        System.out.println("-----------------------");
        vendingMachine.selectSnack("pepsi");
        change = vendingMachine.insertMoney(CASH);
        System.out.println("Change after item: " + change);

        // Testing buying empty Pepsi
        System.out.println();
        System.out.println("-----------------------");
        vendingMachine.selectSnack("pepsi");
        change = vendingMachine.insertMoney(CASH);
        System.out.println("Change after item: " + change);

        // Buying Coke
        System.out.println();
        System.out.println("-----------------------");
        vendingMachine.selectSnack("coke");
        change = vendingMachine.insertMoney(CASH);
        System.out.println("Change after item: " + change);

        // Buying Snickers
        System.out.println();
        System.out.println("-----------------------");
        vendingMachine.selectSnack("snickers");
        change = vendingMachine.insertMoney(CASH);
        System.out.println("Change after item: " + change);
    }
}